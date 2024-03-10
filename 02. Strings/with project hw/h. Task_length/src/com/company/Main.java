package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1=x.nextLine();

        System.out.println("Enter another string: ");
        String s2=x.nextLine();
int p = s1.length();
int q = s2.length();

        System.out.println("Length of string "+s1+" is "+p);
        System.out.println("Length of string "+s2+" is "+q);


    }
}
