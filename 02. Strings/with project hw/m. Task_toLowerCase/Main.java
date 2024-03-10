package com.company;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a string");
        String s1=x.nextLine();
        System.out.println(s1.toLowerCase());
    }
}
