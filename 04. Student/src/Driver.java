import java.util.Scanner;
public class Driver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
       System.out.print("Please enter number of students:");
       int n = input.nextInt();

        student idHolder[] = new student[n];

        for(int i=0;i<idHolder.length;i++)
        {
            String token = input.nextLine();
            System.out.println("***************************************************");
            System.out.println("------ Input Information of Student::"+ (i+1)+" -----");
            System.out.println("***************************************************");

            System.out.print("Please Enter Student's ID:");
            String id = input.nextLine();
            System.out.print("Please Enter Student's CGPA:");
            double cg = input.nextDouble();
            idHolder[i] = new student(id,cg);
        }

        System.out.println();

        System.out.println("-------Displaying all Students' Information-------");
        for(int i=0;i<idHolder.length;i++)
        {
            System.out.println("-------------Student::" + (i+1)+"----------------------");
            idHolder[i].display();
        }

        System.out.println();

    }


}
