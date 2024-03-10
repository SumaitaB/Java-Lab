package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n,x,y=0,i;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the value of n to calculate the value of y");
        n = s.nextInt();

        for(i=1;i<=n;i++) {
            if (i % 2 == 0) {
                x = i * i * (-1);
            } else {
                x = i * i;
            }
            y += x;
        }
        System.out.print("y = ");
        System.out.println(y);
    }
}


