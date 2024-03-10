package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String []args)
    {
        Scanner x = new Scanner(System.in);

        System.out.println("enter matrix size: ");

        int p,q;

        p = x.nextInt();
        q = x.nextInt();
        System.out.println("enter matrix: ");
        int a[][]=new int[p][q];
        int b[][]=new int[p][q];
        for(int i=0; i<p;i++)
        {
            for(int j=0; j<q;j++)
            {
                a[i][j]=x.nextInt();
            }
        }
        System.out.println("enter another matrix: ");
        for(int i=0; i<p;i++)
        {
            for(int j=0; j<q;j++)
            {
                b[i][j]=x.nextInt();
            }
        }

        int c[][]=new int[p][q];

        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}