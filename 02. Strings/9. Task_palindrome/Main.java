package com.company;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1=x.nextLine();

        StringBuffer s2 =new StringBuffer();
        int p = s1.length();
        p=p-1;

        for(int i = p; i >= 0 ; i--)
        {
            s2 = s2.append(s1.charAt(i));
        }

        if(s1.equalsIgnoreCase(s2.toString()))
        {
            System.out.println("YES, String is palindrome");
        }
        else
            {
            System.out.println("NO, String is not palindrome");
        }
    }
}
