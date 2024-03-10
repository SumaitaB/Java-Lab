package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String []args)
    {
        Scanner x = new Scanner(System.in);

        String s1 = x.nextLine();

        char a[] = s1.toCharArray();
        Arrays.sort(a);
        s1 = new String(a);
        s1=s1.toUpperCase();
        int[] c = new int[300];
        int i;
        for (i=0; i< s1.length(); i++)
        {
            if((s1.charAt(i))>='A'&&s1.charAt(i)<='Z')
            {
            (c[s1.charAt(i)])++;
            }
        }

        for (i = 0; i < 300; i++)
        {
            if((c[s1.charAt(i)])>0)

            System.out.println(s1.charAt(i)+": "+c[s1.charAt(i)]);
        }

        }
    }