package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner x = new Scanner(System.in);
        System.out.print("Input string: ");
        String s = x.nextLine();

        char ch[]= new char[s.length()];

        for(int i=0;i<s.length();i++)
        {
            ch[i]= s.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
            {
                count++;
            }
        }
        System.out.println("Number of words = "+count);
    }
}
