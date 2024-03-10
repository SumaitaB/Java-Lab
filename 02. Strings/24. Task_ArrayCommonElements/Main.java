
package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String []args)
    {
        Scanner x = new Scanner(System.in);

        System.out.println("enter array size: ");
        int p,q;
        p = x.nextInt();

        System.out.println("enter 1st array: ");

        int a[]=new int[p];
        int b[]=new int[p];

        for(int i=0; i<p;i++)
        {
                a[i]=x.nextInt();
        }
        System.out.println("enter 2nd array: ");
        for(int i=0; i<p;i++)
        {
                b[i]=x.nextInt();
        }
        System.out.println("Common elements: ");

        for(int i = 0; i <a.length; i++)
        {
            for(int j = 0; j < b.length; j++)
            {
                if(a[i] == b[j])
                {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}