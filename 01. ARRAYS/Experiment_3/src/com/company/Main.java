package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        int n,m,c,i;

        n = s.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            c = s.nextInt();
            a[i]=c;
        }
        m = s.nextInt();
        int b[] = new int[m];
for(i=0;i<m;i++)
{
    c = s.nextInt();
    b[i]=c;
}


        int cnt=0;

        for(i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {

                      if(a[i]==b[j])
                      {
                          cnt++;
                      }


            }
        }
        System.out.println(cnt);





    }
}

