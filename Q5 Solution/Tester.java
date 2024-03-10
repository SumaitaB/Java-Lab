public class Tester
{
    public static void main(String[] args)
    {
        SavingsAccount SA = new SavingsAccount("Account-0001", 2000.00);
        CurrentAccount CA = new CurrentAccount("Account-0002", 3000.00);

        SA.calculateYearlyInterest();
        CA.calculateYearlyInterest();

        System.out.println("Account Balance of " + SA.getAcc_number() + " : " + SA.getAcc_balance());
        System.out.println("Account Balance of " + CA.getAcc_number() + " : " + CA.getAcc_balance());

        SA.deposit(1500.00);
        System.out.println("Account Balance of " + SA.getAcc_number() + " : " + SA.getAcc_balance());
        SA.withdraw(500.00);
        System.out.println("Account Balance of " + SA.getAcc_number() + " : " + SA.getAcc_balance());

        CA.deposit(2000.00);
        System.out.println("Account Balance of " + CA.getAcc_number() + " : " + CA.getAcc_balance());
        CA.withdraw(1200.00);
        System.out.println("Account Balance of " + CA.getAcc_number() + " : " + CA.getAcc_balance());
    }
}
