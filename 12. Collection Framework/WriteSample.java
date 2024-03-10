import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class WriteSample {

    public static void main(String[] args) {
        try {

            FileReader reader = new FileReader("C:\\Users\\ASUS\\Collection Framework\\src\\Sample.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            HashMap<String, Integer> hashMap = new HashMap<>();

            while ((line = bufferedReader.readLine()) != null) {

                String str = line;
                String[] arrOfStr = str.split("[(, ?:.@)]+");

                for (int i = 0; i < arrOfStr.length; i++) {
                    System.out.println(arrOfStr[i]);
                }
                System.out.println("          ------------------------------");
                System.out.println("Number of the total words: " + line.length());
                System.out.println("          ------------------------------");


                for (String word : arrOfStr) {
                    if (hashMap.containsKey(word)) {
                        hashMap.put(word.toLowerCase(), hashMap.get(word) + 1);

                    } else {
                        hashMap.put(word, 1);
                    }

                }
                Set<String> hashset = hashMap.keySet();
                File file = new File("C:\\Users\\ASUS\\Collection Framework\\src\\Sample.txt");
                if (file.createNewFile()) {
                    System.out.println("File created :" + file.getName());
                }
                else {
                    System.out.println("----The file is already exists!.------");

                    System.out.println("-----The distinct words are: ----");
                    for (String word : hashset) {

                        if (hashMap.get(word) > 1) {

                            System.out.println("The frequency of the word '" + word + "' is : " + hashMap.get(word));


                        }
                        FileWriter writer = new FileWriter(file, false);
                        BufferedWriter bufferedWriter = new BufferedWriter(writer);

                        bufferedWriter.write(line);

                        bufferedWriter.write("The frequency of the word '" + word + "' is : " + hashMap.get(word));

                        bufferedWriter.close();

                    }

                }

            }
            bufferedReader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}



