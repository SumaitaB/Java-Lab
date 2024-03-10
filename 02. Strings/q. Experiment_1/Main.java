package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner x = new Scanner(System.in);

        String a=x.nextLine();
        String b=x.nextLine();
        String c=x.nextLine();

        String s = a.replaceAll(b, c);
        System.out.println(s);


    }
}
