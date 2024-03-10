import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        try
        {
            String src = "C:\\Users\\ASUS\\Q6\\src";
            File f1 = new File(src, "Score.txt");
            FileWriter writer = new FileWriter(f1, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            int id;
            double score;
            bufferedWriter.write("ID \tScore");
            bufferedWriter.newLine();
            while(true)
            {
                System.out.println("-------------------------Input Information? (Y/N)---------------------");
                char s = input.next().charAt(0);
                if(s == 'Y' || s == 'y')
                {
                    System.out.println("------------------------Enter ID :----------------------------");
                    id = input.nextInt();
                    System.out.println("----------------------------Enter Score :----------------------------");
                    score = input.nextDouble();
                    bufferedWriter.write(id + "\t" + score);
                    bufferedWriter.newLine();
                }
                else break;
            }
            bufferedWriter.close();
            writer.close();

            FileReader reader = new FileReader(f1);
            BufferedReader bufferedReader = new BufferedReader(reader);
            int num = 0;
            double average = 0;
            String line;
            int f = 0;
            while((line = bufferedReader.readLine()) != null)
            {
                if(f == 1)
                {
                    num++;
                    StringTokenizer st1 = new StringTokenizer(line, "\t");
                    int x = Integer.parseInt(st1.nextToken());
                    double d = Double.parseDouble(st1.nextToken());
                    average += d;
                }
                else f = 1;
            }
            average = (average / num * 1.0);
            System.out.println("-----------------------------Number of Students : ------------------" + num);
            System.out.println("-------------------------------Average Score : ---------------------" + average);
            bufferedReader.close();
            reader.close();

            int aboveAverage = 0;
            System.out.println("-----------------------Students with score above average : ----------------------");
            FileReader reader1 = new FileReader(f1);
            BufferedReader bufferedReader1 = new BufferedReader(reader1);
            String line1;
            int g = 0;
            while((line1 = bufferedReader1.readLine()) != null)
            {
                if(g == 1)
                {
                    num++;
                    StringTokenizer st2 = new StringTokenizer(line1, "\t");
                    int x = Integer.parseInt(st2.nextToken());
                    double d = Double.parseDouble(st2.nextToken());
                    if(d > average)
                    {
                        System.out.println(x);
                        aboveAverage++;
                    }
                }
                else g = 1;
            }
            System.out.println("-------------------Number of students with score above average--------------- : " + aboveAverage );
            bufferedReader1.close();
            reader1.close();

            FileWriter writer1 = new FileWriter(f1, true);
            BufferedWriter bufferedWriter1 = new BufferedWriter(writer1);
            while(true)
            {
                System.out.println("------------------------Input Information? (Y/N)----------------------");
                char s = input.next().charAt(0);
                if(s == 'Y' || s == 'y')
                {
                    System.out.println("--------------------------Enter ID :------------------------");
                    id = input.nextInt();
                    System.out.println("--------------------------Enter Score :-----------------------");
                    score = input.nextDouble();
                    bufferedWriter1.write(id + "\t" + score);
                    bufferedWriter1.newLine();
                }
                else break;
            }
            bufferedWriter1.close();
            writer1.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
