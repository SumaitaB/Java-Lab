import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s1, s2;
        System.out.println("-----------Enter a word: -----------");
        s1 = input.nextLine();
        System.out.println("-----------Enter another word: -----------");
        s2 = input.nextLine();
        if(s1.compareTo(s2) < 0)
        {
            System.out.println("\"" + s1 + "\"" + " is lexicographically less than " + "\"" + s2 + "\"");
        }
        if(s1.compareTo(s2) > 0)
        {
            System.out.println("\"" + s1 + "\"" + " is lexicographically greater than " + "\"" + s2 + "\"");
        }
        if(s1.compareTo(s2) == 0)
        {
            System.out.println("\"" + s1 + "\"" + " is lexicographically equal to " + "\"" + s2 + "\"");
        }
    }
}
