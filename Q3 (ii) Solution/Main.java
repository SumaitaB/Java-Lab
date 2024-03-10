public class Main
{
    public static void main(String[] args)
    {
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;

        //----------------------------infinite while loop--------------------------------------
        while(number1 >= 0)
        {
            number1++;
            System.out.println(number1);
        }

        //-----------------------------infinite do-while loop-------------------------------------
        do {
            number2++;
            System.out.println(number2);
        } while(number2 >= 0);

        //--------------------------------infinite for loop-------------------------------------------
        for(int i = 0 ;; i++)
        {
            number3++;
            System.out.println(number3);
        }
    }
}
