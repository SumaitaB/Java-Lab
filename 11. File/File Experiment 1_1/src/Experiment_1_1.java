//------------------------------EXPERIMENT 01---------------------------
// -----------------------------------Task 01-------------------------------
//    To show a list of all file/directory names from “C:\Program Files”.

import java.io.*;
public class Experiment_1_1
{
    public static void main(String[] args)
    {
        String dirpath="C://";
        String dname="Program Files";
        File f = new File(dirpath, dname);

        if(f.exists())
        {
            String arr[]=f.list();
            int n=arr.length;
            for (int i = 0; i < n ; i++) {
                System.out.println(arr[i]);

            }
            System.out.println("No of entries in this directory "+n);
        }
        else
        {
            System.out.println("Directory not found");
        }
    }
}