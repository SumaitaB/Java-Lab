package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1 = x.nextLine();

        char[] c = s1.toCharArray();
        int len = c.length;
        System.out.println("Char Array length: " + len);
        System.out.println("Char Array elements: ");
        int i;
        for (i = 0; i < len; i++)
        {
            System.out.println(c[i]);
        }
    }
}
