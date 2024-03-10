
package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String []args)
    {
        Scanner x = new Scanner(System.in);

        System.out.println("enter string: ");
        int p,q;
        String s = x.nextLine();
        s = s.replaceAll("( )+", " ");
        System.out.println(s);

    }
}
