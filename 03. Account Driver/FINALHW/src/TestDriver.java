public class TestDriver
{
    public static void main(String[] args)
    {

        // Test all constructors
        Account a = new Account("","");   //calls 1st constructor

        System.out.print("A/C name: "+ a.accountName);
        System.out.print(", A/C number: "+ a.getaccountNumber());
        System.out.print(", A/C balance:  "+ a.getbalance());

        System.out.println();

        Account b = new Account("Jane","357",1000);//calls 2nd Constructor

        System.out.print("A/C name: "+ b.accountName);
        System.out.print(", A/C number: "+ b.getaccountNumber());
        System.out.print(", Balance = "+ b.getbalance());
        System.out.println();

        System.out.println();
        System.out.println("-----------Test Setters and Getters--------");
        System.out.println();

        // Test Setters (Mutator Methods) and Getters (Accessor Methods)

        a.setbalance(500.2);

        System.out.println("The balance: " + a.getbalance());
        //The balance is: 500.2

        // Test credit() and debit()


        double add =6.99;
        System.out.printf("The credited amount : %.2f%n", a.credit(add));


        double substract =7.89;
        System.out.printf("The debited amount : %.2f%n", a.debit(substract));


    }

}



