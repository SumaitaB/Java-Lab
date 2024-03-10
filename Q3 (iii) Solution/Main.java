public class Main
{
    public static void main(String[] args)
    {
        //------------------------------while loop that counts backwards from 20 to 10----------------------------
        System.out.println("------------While loop : -----------");
        int x = 20;
        while(x>=10)
        {
            System.out.println(x);
            x--;
        }
        System.out.println();

        //-----------------------------------do-while loop that counts backwards 20 to 10--------------------------------
        System.out.println("----------------do-while loop : -------------");
        x = 20;
        do {
            System.out.println(x);
            x--;
        }while(x >= 10);
        System.out.println();

        //-------------------------------------for loop that counts backwards 20 to 10----------------------------
        System.out.println("---------------------for loop : ---------------------");
        x=20;
        for(int i = 20; i >= 10; i--)
        {
            System.out.println(x);
            x--;
        }
    }
}
