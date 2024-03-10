import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Float> arr = new ArrayList<Float>();
        arr.add((float) 12.34);
        arr.add((float) 34.5);
        arr.add((float) 5.6);
        arr.add((float) 7.89);
        arr.add((float) 10.12);
        arr.add((float) 3.45);

        System.out.println("--------------------------Number of elements in the object : -----------------------" + arr.size());

        System.out.println("--------------------Removing 5.6 and 10.12 from the list.--------------------");
        arr.remove((float)5.6);
        arr.remove((float)10.12);

        System.out.println("-----------------------------Displaying the content of the object : ------------------------");
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i) + " ");
        }
    }
}
