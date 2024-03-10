import java.util.*;

public class Task01_ExceptionDriverTest
{
    public static void main(String args[])
    {

        Scanner x = new Scanner(System.in);
        int cnt=0, sum=0;

        while(cnt<5)
        {
            System.out.println("Please enter an integer number: ");
            try {
                int n = x.nextInt();
                cnt++;
                sum += n;
            }
            catch(InputMismatchException e)
            {
                System.out.println(e);
                System.out.println("You have not entered an integer number.");
                String newinput = x.nextLine();

            }
        }
        System.out.println("SUM = "+sum);
    }
}