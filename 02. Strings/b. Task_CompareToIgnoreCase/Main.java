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

        if((s1.compareToIgnoreCase(s2))==0)
        {
            System.out.println("The strings "+s1+" and "+s2+" are the same");
            System.out.println(s1+" = " +s2);
        }
        else
        {
            System.out.println("The strings "+s1+" and "+s2+" are NOT the same");

        }


    }
}
