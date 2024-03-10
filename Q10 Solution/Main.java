import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------Enter a String---------------------------");
        String s = input.nextLine();

        StringBuilder t = new StringBuilder(s);
        t.reverse();
        String reverse_s = t.toString();
        boolean flag = true;

        for(int i = 0; i < s.length() ; i++)
        {
            if(s.charAt(i) != reverse_s.charAt(i))
            {
                flag = false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("-----------------The string entered is palindrome.-----------------------");
        }
        else
        {
            System.out.println("-----------------------The string entered is NOT palindrome---------------------");
        }
    }
}
