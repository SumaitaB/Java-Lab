package com.company;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String []args)
    {
        String s = "23.5 3 8 20 32";
        String[] str = s.split(" ");
        double a = Double.parseDouble(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int d = Integer.parseInt(str[3]);
        int e = Integer.parseInt(str[4]);
        double w=a+b+c+d+e;
         System.out.println("Sum =  " +w);
    }
}