package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1=x.nextLine();

        System.out.println("Enter another string to concatenate: ");
        String s2=x.nextLine();

        String s3=s1+s2;
            System.out.println(s3);

    }
}
