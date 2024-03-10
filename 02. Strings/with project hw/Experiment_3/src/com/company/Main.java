package com.company;
import java.util.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        String s = x.nextLine();
        System.out.print("Smallest Word: ");
        System.out.println(Arrays.stream(s.split(" ")).min(Comparator.comparingInt(String::length)).orElse(null));
        System.out.print("Largest Word: ");
        System.out.println(Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null));

    }
}