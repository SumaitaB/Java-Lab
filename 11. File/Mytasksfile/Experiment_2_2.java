//------------------------------EXPERIMENT 02---------------------------
// -----------------------------------Task 02-------------------------------
//    -------To copy the contents of SampleInput.txt to SampleOuput.txt------------
import java.io.*;
import java.util.*;

public class Experiment_2_2
{
    public static void main(String[] args)
    {

        try {
            String src = "C:\\Users\\ASUS\\File Experiment_2_2\\src";
            File f1 = new File(src, "SampleInput.txt");
            File f2 = new File("C:\\Users\\ASUS\\File Experiment_2_2\\src", "SampleOutput.txt");
            FileWriter write = new FileWriter(f2,true);
            BufferedWriter buffwrite = new BufferedWriter(write);
            Scanner input = new Scanner(f1);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                buffwrite.write(line);

            }
            buffwrite.close();
            write.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}