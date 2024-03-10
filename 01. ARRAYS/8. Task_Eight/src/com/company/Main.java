package com.company;

import java.util.Scanner;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int b[] = new int[10];
        int a[] = new int[10];
        int d[] = new int[10];


        Scanner s = new Scanner(System.in);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int n,i,j,c=0;

        System.out.println("Enter Ten Numbers: ");

        for(i=0;i<10;i++)
        {
            n = s.nextInt();
            a[i]=n;
            d[i]=n;

            if(m.containsKey(n))
        {

            c = m.get(n);
            m.put(n,c+1);
        }
        else {
            m.put(n,1);
        }
        }


        for(i=0;i<10;i++)
        {
            for(j = i+1;j<10;j++)
            {
                if(d[i]==d[j])
                {
                    d[j]=-1;
                }
            }
        }
        int p=0;
        for(i=0;i<10;i++)
        {
            if(d[i]!=-1) {
                if (m.get(d[i]) >= 2 && m.get(d[i]) <= 4) {
                    b[p] = a[i];
                    p++;
                }
            }
        }
        System.out.println("The numbers entered with maximum 4 times of repetition and a minimum of 2 times of repitition each, are: ");
       for(i=0;i<p;i++){


            System.out.print(b[i]);
            System.out.print(" ");
        }
    }
}

