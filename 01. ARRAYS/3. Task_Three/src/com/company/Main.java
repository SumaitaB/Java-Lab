package com.company;

import java.util.Scanner;

class Main
{

    public static void main(String[] args)

    {

        int n, i,j,temp;
        Scanner s = new Scanner(System.in);

        int a[] = new int[10];

        System.out.println("Enter ten  numbers:");

        for (i = 0; i < 10; i++)
        {
            a[i] = s.nextInt();
        }

        for(i=0; i<10; i++)
        {
            for(j=i; j<10; j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];   //Selection sort in Descending order
                    a[j]=temp;
                }
            }
        }
        System.out.println("Entered numbers in Descending Order are as follows:");
        for (i = 0; i < 10; i++)
        {
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }

    }
