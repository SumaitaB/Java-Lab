//------------------------------EXPERIMENT 01---------------------------
// -----------------------------------Task 02-------------------------------
//    To check if the directory “C:\Program Files\Windows Defender” exists or not.

import java.io.*;
public class Experiment_1_2
{
    public static void main(String[] args)
    {

        String dirpath="C:\\Program Files";
        String dname="Windows Defender";

        File f = new File(dirpath, dname);

        System.out.println("File name : "+f.getName());
        System.out.println("Path : "+f.getPath());
        System.out.println("Parent : "+f.getParent());
        System.out.println("Exists : "+f.exists());
    }
}