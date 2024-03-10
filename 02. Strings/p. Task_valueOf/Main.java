package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int p=x.nextInt();

        System.out.println("Integer converted to string: ");
        String s1 = String.valueOf(p);
        System.out.println(s1);
    }
}
