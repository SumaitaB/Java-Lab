package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String s1=x.nextLine();

        for(int i = 0; i < s1.length(); i++)
        {
            int p = s1.charAt(i);
            System.out.println(s1.charAt(i)+" ASCII value: "+p);

        }
    }
}