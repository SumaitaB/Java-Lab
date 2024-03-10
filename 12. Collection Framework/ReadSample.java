import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadSample {
    public static void main(String[] args){
        try {
            FileReader reader = new FileReader("C:\\Users\\ASUS\\Collection Framework\\src\\Sample.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

