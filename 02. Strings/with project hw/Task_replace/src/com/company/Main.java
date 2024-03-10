package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1=x.nextLine();

        System.out.println("Enter a character that you would like to replace:");
        String s2=x.next();

        System.out.println("Enter a character that you would like to replace "+s2+" with: ");
        String s3=x.next();

        String str=s1.replace(s2,s3);//replaces all occurrences of s2 to s3

        System.out.println(str);


    }
}
