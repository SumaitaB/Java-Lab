package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = x.nextLine();
        System.out.println("Enter a substring to count occurrence: ");
        String s2 = x.nextLine();

        int p = 0;
        int cnt = 0;
        int n = s2.length();
        while ((p = s1.indexOf(s2, p))!=-1)
        {
            p = p + n;
            cnt++;
        }
        System.out.println(s2 + "' has occured " + cnt + " times in: " + s1);
    }
}