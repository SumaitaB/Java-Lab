package com.company;

import java.util.Scanner;

class Main
{

    public static void main(String[] args)

    {

        int n, i;
        Scanner s = new Scanner(System.in);

        int a[] = new int[10];

        System.out.println("Enter ten  numbers:");

        for (i = 0; i < 10; i++)
        {

            a[i] = s.nextInt();
            System.out.print("You have entered : ");
            System.out.println(a[i]);
        }

    }
}
