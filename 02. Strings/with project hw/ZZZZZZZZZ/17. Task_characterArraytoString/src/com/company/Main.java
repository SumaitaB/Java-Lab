package com.company;

import java.util.Scanner;

public class Main
{
        public static void main(String []args)
        {
            Scanner x = new Scanner(System.in);
            int p;
            System.out.println("Enter a character array: ");
            char[] a = x.next().toCharArray();
            p=a.length;
            String r="";
            String s1 = String.copyValueOf(a, 0, p);

            System.out.println("Character array to string: "+s1);
        }
    }
