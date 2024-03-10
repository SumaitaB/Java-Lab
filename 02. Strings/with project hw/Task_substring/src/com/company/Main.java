package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1=x.nextLine();

        String s2 = s1.substring(0,7); //prints substring from index 8 to 17;
        System.out.println(s2);


    }
}
