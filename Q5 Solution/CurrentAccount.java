public class CurrentAccount extends Account
{
    public CurrentAccount(String acc_number, double acc_balance)
    {
        super(acc_number, acc_balance);
    }

    public void calculateYearlyInterest()
    {
        double yearlyInterest = getAcc_balance() * (6.0 / 100.0);
        setAcc_balance(yearlyInterest + getAcc_balance());
    }
}
