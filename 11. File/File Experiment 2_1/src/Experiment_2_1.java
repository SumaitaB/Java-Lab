//------------------------------EXPERIMENT 02---------------------------
// -----------------------------------Task 01-------------------------------
//    --------------------------To read the file SampleInput.txt.------------
import java.io.*;
import java.util.*;

public class Experiment_2_1
{
    public static void main(String[] args)
    {

        try {
            FileReader reader = new FileReader("src\\SampleInput.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("The line is: "+ line);

            }

            reader.close();

        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}