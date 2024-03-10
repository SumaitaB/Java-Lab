import java.util.*;
import java.io.*;
public class Main
{
    public static int countWords(String str)
    {
        int count = 0;
        for(int i = 0; i + 1< str.length(); i++)
        {
            if(str.charAt(i) == ' ' || str.charAt(i) == ',' || str.charAt(i) == '?' || str.charAt(i) == ':' || str.charAt(i) == '.' || str.charAt(i) == ';')
            {
                if(str.charAt(i + 1) != ' ' && str.charAt(i + 1) != ',' && str.charAt(i + 1) != '?' && str.charAt(i + 1) != ':' && str.charAt(i + 1) != '.' && str.charAt(i + 1) != ';')
                {
                    count++;
                }
            }

        }
        return count + 1;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s;
        s = scan.nextLine();
        System.out.println("Number of Words: ");
        System.out.println(countWords(s));
    }
}
