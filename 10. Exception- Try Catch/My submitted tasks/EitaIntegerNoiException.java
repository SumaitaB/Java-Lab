public class EitaIntegerNoiException extends Exception
{
    private String msg;
    EitaIntegerNoiException(String s)
    {
        msg = s;
    }
    public String toString()
    {
        return "EitaIntegerNoiException is thrown because of the input from user:" + msg ;
    }
    public void printError()
    {
        System.out.println("The argument: " +  msg + " is not a integer!!");
    }
}