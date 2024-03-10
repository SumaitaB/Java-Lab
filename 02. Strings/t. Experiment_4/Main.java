package com.company;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String []args)
    {
        Scanner x = new Scanner(System.in);
        int p = x.nextInt();
        for(int w=0;w<=p;w++)
        {
            //
            //char c = x.next().charAt(0);
            String s1 = x.nextLine();

            char a[] = s1.toCharArray();

            for (int i = 0; i < a.length; i++) {
                for (int j = i; j < a.length; j++) {
                    if (a[i] > a[j]) {
                        char temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            s1 = new String(a);
            System.out.println(s1);
           s1="";
        }

    }
}