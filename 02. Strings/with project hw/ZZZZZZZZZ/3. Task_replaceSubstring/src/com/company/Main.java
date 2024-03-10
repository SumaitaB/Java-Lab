package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner x = new Scanner(System.in);
            System.out.println("Enter a string: ");

            String s1=x.nextLine();

            System.out.println("Enter a substring: to replace ");

            String s2=x.nextLine();
            System.out.println("Enter a substring: to replace with");

            String s3=x.nextLine();
            String str = s1.replaceAll(s2, s3);


                System.out.println(str);


    }
}
