package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Input string: ");
        String s1 = x.nextLine();
        s1 = s1.trim();
        String r = "";
        char[] ch=s1.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            r += ch[i];
        }
        System.out.println("Reverse word: "+r.trim());
    }
}