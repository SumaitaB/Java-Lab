package com.company;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = x.nextLine();

        char s[] = s1.toCharArray();

        int n = s.length;

        int index = 0;

        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (s[i] == s[j])
                {
                    break;
                }
            }


            if (j == i)
            {
                s[index++] = s[i];
            }
        }
        String q = String.valueOf(Arrays.copyOf(s, index));
        System.out.println(q);
    }
}
