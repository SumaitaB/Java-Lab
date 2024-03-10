package com.company;

import java.util.Scanner;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int x[] = new int[5];
        Scanner s = new Scanner(System.in);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        //Map m = new HashMap(Integer,Integer);
        int n,i;
        System.out.println("Enter five unique numbers: ");

        n = s.nextInt();
        m.put(n,1);
        x[0]=n;
int cnt=1;
i=0;
        while(cnt!=5)
        {
            n = s.nextInt();
            if(m.containsKey(n))
            {
                for(int p=0;;p++)
                {
                    System.out.print(n);
                    System.out.println(" is already in among the entered numbers enter a new number");
                    //n = s.nextInt();
                    break;
                }
                continue;

            }
            else
            {
                m.put(n,1);
                x[cnt]=n;
                cnt++;

            }
        }
        System.out.println("The 5 unique numbers entered are: ");
        for(int q=0; q<5; q++)
        {
            System.out.print(x[q]);
            System.out.print(" ");
        }
    }
}

