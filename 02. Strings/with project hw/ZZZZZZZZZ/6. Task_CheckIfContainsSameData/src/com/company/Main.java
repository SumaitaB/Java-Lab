package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1=x.nextLine();

        System.out.println("Enter another string to check if contains string 1 and 2 contains same data");
        String s2=x.nextLine();

        if((s1.equalsIgnoreCase(s2))==true)
        {
            System.out.println("Yes. String "+s1+" is equal to "+s2);
        }
        else
        {
            System.out.println("NO. String "+s1+" is NOT equal to "+s2);

        }


    }
}
