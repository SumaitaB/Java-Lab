
//------------------------------EXPERIMENT 03----------------------------------------
// -----------------------------------Task 01, 02 and 03-----------------------------
//    -------Task : To create a file named data.txt in the C drive root------------
//    -------Task : To Write three numbers ( 14   15   16)-------------------------
//	  i)  on three separate lines.
//    -------Task : To read data from the file data.txt.
//    It should give 45 as output:

import java.io.*;
import java.util.*;

public class Experiment_3
{
    public static void main(String[] args)
    {
        //----------------------------Creating file Data.txt-------------------
        try {

            File myObj = new File("C:\\HometaskFile\\Data.txt");
            if (myObj.createNewFile())
            {
                System.out.println("File created: " + myObj.getName());
            }
            else
            {
                System.out.println("File already exists.");
            }

            //----------------------------Writing in Data.txt-------------------

            FileWriter writer =new FileWriter(myObj,false);
            BufferedWriter bufferedWriter =new BufferedWriter(writer);

            bufferedWriter.write("14");
            bufferedWriter.newLine();
            bufferedWriter.write("15");
            bufferedWriter.newLine();
            bufferedWriter.write("16");

            bufferedWriter.close();
            writer.close();

        }
        catch(IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //----------------------------Reading from Data.txt-------------------

        try {
            String src = "C:\\HometaskFile";
            File f = new File(src,"Data.txt");
            Scanner input = new Scanner(f);
            int s=0;
            while (input.hasNextInt())
            {
                int n = input.nextInt();
                s+=n;

            }
            System.out.println(s);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}