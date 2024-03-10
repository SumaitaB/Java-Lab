package com.company;

import java.util.Scanner;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int x[] = new int[11];
        Scanner s = new Scanner(System.in);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int n;
        System.out.println("Enter Eleven numbers: ");

        n = s.nextInt();
        m.put(n,1);
        x[0]=n;
        int cnt=1;
        while(cnt!=11)
        {
            n = s.nextInt();

            if(m.containsKey(n))
            {
                if (m.get(n) >= 4) {
                    System.out.print(n);
                    System.out.println(" has already been entered 4 times. Enter a new number: ");
                    continue;
                } else {
                    int c = m.get(n);
                    m.put(n, c + 1);
                    x[cnt] = n;
                    cnt++;
                }
            }
            else {
                m.put(n,1);
                x[cnt]=n;
                cnt++;
            }
            }

        System.out.println("The numbers entered with maximum 4 times of repetition each, are: ");
        for(int q=0; q<11; q++)
        {
            System.out.print(x[q]);
            System.out.print(" ");
        }
    }
}

