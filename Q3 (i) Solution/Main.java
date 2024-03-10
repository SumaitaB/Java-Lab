import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n,x,sum=0,i;
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to find the summation to? : ");
        n = input.nextInt();

        System.out.println("Enter the " + n + " numbers :");

        for(i = 0; i < n; i++)
        {
            x = input.nextInt();
            sum  + = x;
        }
        System.out.println("Summation = " + sum);
    }
}
