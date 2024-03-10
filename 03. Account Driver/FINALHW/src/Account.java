public class Account
{
    // The public constants
    public static final String DEFAULT_accountNumber = "";
    public static final String DEFAULT_accountName = "";
    public static final double DEFAULT_balance  = 0.00;

    // The private instance variables
    private double balance;
    private String accountNumber;
    // The public instance variable
    public String accountName;

    // The (overloaded) constructors
    public Account(String accountName, String accountNumber) // 1st (default) Constructor
    {
        accountName=DEFAULT_accountName;
        accountNumber=DEFAULT_accountNumber;

    }

    public Account(String accountname,String accountnumber,double bbalance)  // 2nd Constructor
    {
        accountName=accountname;
        accountNumber=accountnumber;
        balance=bbalance;

    }

    /** Returns the balance - the public getter for private variable balance. */
    public double getbalance() {
        return balance;
    }
    /** Sets the balance - the public setter for private variable balance */
    public void setbalance(double balance) {
        this.balance = balance;
    }

    /** Returns the accountNumber - the public getter for private variable accountNumber. */
    public String getaccountNumber() {
        return accountNumber;
    }

    /**Adds Balance */
    public double credit(double add)
    {
        double newbalance = balance+add;
        return newbalance;
    }

    /** Subtracts balance*/
    public double debit(double substract)
    {
        double newbalance = balance-substract;
        return newbalance;
    }
}
