import java.util.*;
public class Exception
{
    static int readInteger(   ) throws EitaIntegerNoiException
    {
        Scanner k = new Scanner(System.in);
        String s;
        int answer;
        s = k.nextLine();
        if (s.contains("."))
        {
            throw new EitaIntegerNoiException(s);
        }
        else
        {
            answer = Integer.parseInt(s);
            System.out.println("Number [" + s+"] is an Integer.");

        }
        return answer;
    }
    public static void main(String args[])
    {
        try {
            readInteger();
        }
        catch(EitaIntegerNoiException e)
        {
            System.out.println(e);
            e.printError();
        }
    }
}