package com.company;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main
{

    public static void main(String args[])
    {

        int[] c = new int[300];
        int i;
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1=x.nextLine();

        for (i=0; i< s1.length(); i++)
        {
            (c[s1.charAt(i)])++;
        }

        int first = 0, second = 0;
        for (i = 0; i < 300; i++)
        {
            if (c[i] > c[first])
            {
                second = first;
                first = i;
            }
            else if (c[i] > c[second] && c[i] != c[first])
            {
                second = i;
            }
        }

        char r = (char)second;
        if (r!= '\0')
            System.out.println("Second most frequent char"+
                    " is " + r);
        else
            System.out.println("No second most frequent"+
                    "character");
    }
}