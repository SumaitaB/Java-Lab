public class SavingsAccount extends Account
{
    public SavingsAccount(String acc_number, double acc_balance)
    {
        super(acc_number, acc_balance);
    }

    public void calculateYearlyInterest()
    {
        double yearlyInterest = getAcc_balance() * (10.0 / 100.0);
        setAcc_balance(yearlyInterest + getAcc_balance());
    }
}
