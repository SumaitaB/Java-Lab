package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1=x.nextLine();

        System.out.println("Enter another string to see if the previously entered string ends with it");
        String s2=x.nextLine();

        if((s1.endsWith(s2))==true)
        {
            System.out.println("Yes. String "+s1+" ends with String  "+s2);
        }
        else
        {
            System.out.println("No. String "+s1+" does not end with String "+s2);

        }


    }
}
