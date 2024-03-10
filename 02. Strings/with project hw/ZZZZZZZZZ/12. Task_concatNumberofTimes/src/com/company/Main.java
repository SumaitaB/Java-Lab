package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = x.nextLine();
        System.out.println("Enter a how many times you would want to ocncatenate: ");
        int p = x.nextInt();
        String r;
        if (s1 == null || s1.isEmpty())
        {
            r="";
        }
        if (p <= 0)
        {
            r=s1;
        }

        StringBuilder y = new StringBuilder(s1.length() * p);

        for (int i = 1; i <= p; i++)
        {
            y.append(s1);
        }
        r = y.toString();

        System.out.println("After repeating "+p+" times: " +r);
    }
}
