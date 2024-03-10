public class Main
{
    public static void main(String[] args)
    {
        //-------------------------------Never Executing For Loop--------------------------------
        for(int i = 10; i < 10; i++)
        {
            System.out.println("-----------------for loop--------------------");
        }

        //-------------------------------Never Executing While Loop----------------------------------
        int a = 10;
        while(a < 9)
        {
            System.out.println("----------------------while loop--------------------");
        }

        //-------------------------------Never Executing do-while Loop----------------------

        /*Note: It isn't possible to write a do-while loop that will never execute
        The characteristics of a do-while loop suggests that it is meant to execute at least once
        Hence, although this may not seem to be executed,
        in reality the loop will be executed exactly only once*/
        int b = 10;
        do {
            b++;
        }while(b < 10);
        //////////////////////////////////////////////////////////

    }
}
