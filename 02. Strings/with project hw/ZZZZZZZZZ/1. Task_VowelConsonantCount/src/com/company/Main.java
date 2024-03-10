package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int v=0, c=0, d=0;

        Scanner x = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1=x.nextLine();

        s1= s1.toLowerCase();

        for(int i = 0; i < s1.length(); i++)
        {

            if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u')
            {

                v++;
            }

            else if(s1.charAt(i) >= 'a' && s1.charAt(i)<='z')
            {

                c++;
            }else if(s1.charAt(i) >= '0' && s1.charAt(i)<='9')
            {

                d++;
            }
        }
        System.out.println("Number of vowels: " + v);
        System.out.println("Number of consonants: " + c);
        System.out.println("Number of digits: " + d);
    }
}