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
        int b[] = new int[size];
        int d[] = new int[size];

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
        int mx=-999;
        for(i=0;i<size;i++)
        {
            int temp=m.get(a[i]);
            if(mx<temp)
            {
                mx=temp;
            }
        }
        for(i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(d[i]==d[j])
                {
                    d[j]=-1;
                }
            }
        }
        int p=0;
        for(i=0;i<size;i++)
        {
            if(d[i]!=-1) {
                if (m.get(d[i]) == mx )
                {
                    b[p] = a[i];
                    p++;
                }
            }
        }

        for(i=0; i<p; i++)
        {
            for(int j=i; j<p; j++)
            {
                if(b[i]>b[j])
                {
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        for(i=0; i<p; i++)
        {
            System.out.print(b[i]);
            System.out.print(" ");
            System.out.print(mx);
            System.out.println();
        }

    }
}

