package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1=x.nextLine();

        System.out.println("Enter another string to find its occurrence in the previously entered string ");
        String s2=x.nextLine();
        int idx =s1.lastIndexOf(s2);
        System.out.println(idx);


    }
}
