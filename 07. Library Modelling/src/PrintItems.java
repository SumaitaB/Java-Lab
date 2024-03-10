import java.util.Scanner;
public class PrintItems
{
    public static void main(String[] args)
    {
        Item[] items = new Item[5];
        items[0] = new Printed(7985,"Alice in Wonderland",105);
        items[1] = new Multimedia(3565,"In a Sentimental Mood", 597);
        items[2] = new Printed(2365,"Building Java Programs",874);
        items[3] = new Item(5823,"Complete Wreck Diving");
        items[4] = new Multimedia(6503,"Angry Bird", 1234);

        printItems(items);

    }

    public static void printItems (Item[] items)
    {
 int i;
 for(i=0;i<5;i++)
 {
     items[i].display();
 }

 }
}