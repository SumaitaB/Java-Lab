package com.company;

import java.util.Scanner;

class Main
{

    public static void main(String[] args)

    {

        int n, i,j,temp;
        Scanner s = new Scanner(System.in);

        int a[] = new int[10];
        int b[] = new int[10];

        System.out.println("Enter ten  numbers:");

        for (i=0; i<10; i++)
        {
            a[i] = s.nextInt();
            b[i]=a[i];
        }
        System.out.println("Press 1 to sort the numbers in Odd position.");
        System.out.println("Press 2 to sort the numbers in Even positi0n.");
        System.out.println("Press 3 to sort all numbers.");
        n = s.nextInt();
        System.out.println("Entered numbers are:");
        for (i=0; i<10; i++)
        {
            System.out.print(b[i]);
            System.out.print(" ");
        }
        System.out.println();
        if(n==1)
        {
            for(i=0; i<10; i=i+2)
            {
                for(j=i; j<10; j=j+2)
                {
                    if(a[i]<a[j])
                    {
                        temp=a[i];
                        a[i]=a[j];   //Selection sort in Descending order
                        a[j]=temp;
                    }
                }
            }

            System.out.println("Entered numbers Sorted in Descending Order at Odd Positions are as follows:");
            for (i=0; i<10; i++)
            {
                System.out.print(a[i]);
                System.out.print(" ");
            }
        }
        else if(n==2)
        {
            for(i=1; i<10; i=i+2)
            {
                for(j=i; j<10; j=j+2)
                {
                    if(a[i]<a[j])
                    {
                        temp=a[i];
                        a[i]=a[j];   //Selection sort in Descending order
                        a[j]=temp;
                    }
                }
            }
            System.out.println("Entered numbers Sorted in Descending Order at Even Positions are as follows:");
            for (i=0; i<10; i++)
            {
                System.out.print(a[i]);
                System.out.print(" ");
            }
        }
        else if(n==3)
        {
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
            System.out.println("Entered numbers Sorted in Descending Order are as follows:");
            for (i=0; i<10; i++)
            {
                System.out.print(a[i]);
                System.out.print(" ");
            }
        }

    }

}
