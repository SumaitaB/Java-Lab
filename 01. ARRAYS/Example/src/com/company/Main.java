package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	int size;
	size=scanner.nextInt();
	int inputs[]=new int [size];

	for(int i=0;i<size;i++)
    {
        inputs[i]=scanner.nextInt();
    }
	for(int number:inputs)
    {
        System.out.println(number);
    }
    }
}
