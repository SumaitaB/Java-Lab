package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        char[] output;
        char[] input = {'T', 'h', 'i', 's', ' ',' ',' ',' ',' ',' ',' ',' ','i', 's',' ',' ',' ',' ',' ',' ', 'a',' ',' ',' ',' ',' ',' ', 't', 'e', 's', 't','.'};
         int i;


            for (i = 0; i < input.length; i++)
            {
                if (input[i] == ' ')
                {
                    input[i] ='*';
                }
            }

            for (i = 0; i < input.length; i++)
            {
                if(input[i]!='*')
                System.out.print(input[i]);
            }
            System.out.println("");

    }
}