package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1=x.nextLine();
        System.out.println("Enter beginning index to find substring: ");
        int p =x.nextInt();
        System.out.println("Enter ending index to find substring: ");
        int q =x.nextInt();


        String s2 = s1.substring(p,q); //prints substring from index 8 to 17;
        System.out.println(s2);


    }
}
