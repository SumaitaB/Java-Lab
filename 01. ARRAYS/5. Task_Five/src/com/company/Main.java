package com.company;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Main
{
    public static void main(String[] args)
    {
        int n;
       double i,c,f,v,r,l;
        double pi=3.14159;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter Voltage, E = ");
        v = s.nextInt();
        System.out.println("Enter Resistance, R = ");
        r = s.nextInt();
        System.out.println("Enter Frequency, f = ");
        f = s.nextInt();
        System.out.println("Enter Inductance, L = ");
        l = s.nextInt();
        System.out.println("Enter Capacitance, C = ");
        c = s.nextInt();


        i = (v/(sqrt((r*r)+(((2*pi*f*l)-(1.00/(2*pi*f*c)))*((2*pi*f*l)-(1.00/(2*pi*f*c)))))));

        System.out.print("Current, I = ");
        System.out.println(i);
    }
}


