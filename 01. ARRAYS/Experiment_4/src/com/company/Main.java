package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        int n,i,j,c;

        n = s.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            c = s.nextInt();
            a[i]=c;
        }
        int cnt=0;
        for(i=1;i<n-1;i++)
        {
           if((a[i]>a[i-1])&&(a[i]>a[i+1]))
            {
                cnt++;
            }
        else if((a[i]<a[i-1])&&(a[i]<a[i+1]))
            {
                cnt++;
            }
        }
        System.out.println(cnt);





    }
}

