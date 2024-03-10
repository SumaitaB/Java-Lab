package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = x.nextLine();
        String r="";

        int length = s1.length();

        for (int i = length - 1 ; i >= 0 ; i--)
        {
            r = r + s1.charAt(i);
        }

        System.out.println("Reverse of the string: " + r);
    }
}