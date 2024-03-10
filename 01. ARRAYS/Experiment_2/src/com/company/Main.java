package com.company;

import java.util.Scanner;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {

        int size;

        Scanner s = new Scanner(System.in);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int n,c,i;
        size = s.nextInt();

        int a[] = new int[size];
        int d[] = new int[size];

        System.out.println("Enter "+size+" Numbers: ");

        for(i=0;i<size;i++)
        {
            n = s.nextInt();
            a[i]=n;
            d[i]=n;
            if(m.containsKey(n))
            {
                c = m.get(n);
                m.put(n, c + 1);

            }
            else {
                m.put(n,1);
            }
        }

        for(i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(d[i]==d[j])
                {
                    d[j]=-99999;
                }
            }
        }
        int p=0;
        for(i=0;i<size;i++)
        {
            if(d[i]!=-99999) {
                System.out.print(d[i]);
                System.out.print(" ");

            }
        }

    }
}

