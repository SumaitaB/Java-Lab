import java.util.Scanner;
public class Student_Tester
{
public static void main(String[] args)
{
    Scanner input = new Scanner (System.in);
    Scanner input1 = new Scanner(System.in).useDelimiter("\n");
    System.out.println("           ---------Please Enter the NUmber of Students: ----------  ");
    int n = input.nextInt();
    Student[] student = new Student[n];
    for(int i=0;i<n;i++)
    {
        Student stu = new Student();
        System.out.println("Name: ");
        String s = input1.next();
        stu.setName(s);
        System.out.println("ID: ");
        stu.setID(input.nextInt());
        System.out.println("Address: ");
        String s1 = input1.next();
        stu.setAddress(s1);
        student[i] = stu;
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            String x,y;
            Student temp;
            x = student[i].getName();
            y = student[i].getName();
            if(x.compareTo(y)>0)
            {
                temp = student[i];
                student[i] = student[j];
                student[j] = temp;
            }


        }
    }
    System.out.println("Displaying info of the students in alphabetical order: ");
    for(int i=0;i<n;i++)
    {
        System.out.println("Name: ");
        System.out.println(student[i].getName());
        System.out.println("ID: ");
        System.out.println(student[i].getID());
        System.out.println("Address: ");
        System.out.println(student[i].getAddress());
    }

}
}
