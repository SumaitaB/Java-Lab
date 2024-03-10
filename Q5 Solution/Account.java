public abstract class Account
{
    private String acc_number;
    private double acc_balance;

    public abstract void calculateYearlyInterest();

    public Account(String acc_number, double acc_balance)
    {
        this.acc_number = acc_number;
        this.acc_balance = acc_balance;
    }

    public void deposit(double amount)
    {
        this.acc_balance += amount;
    }

    public void withdraw(double amount)
    {
        this.acc_balance -= amount;
    }

    public String getAcc_number()
    {
        return acc_number;
    }

    protected void setAcc_balance(double amount)
    {
        this.acc_balance = amount;
    }

    public double getAcc_balance()
    {
        return acc_balance;
    }
}
