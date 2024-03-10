package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String []args)
    {
        Scanner x = new Scanner(System.in);

        System.out.print("Input string: ");
        String s1 = x.nextLine();

        System.out.print("Input another string: ");
        String s2 = x.nextLine();

        char a[] = s1.toCharArray();
        Arrays.sort(a);


        char b[] = s2.toCharArray();
        Arrays.sort(b);

        s1 = new String(a);
        s2 = new String(b);

        if ((s1.equals(s2)) == true)
        {
            System.out.println("Anagrams");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }
}