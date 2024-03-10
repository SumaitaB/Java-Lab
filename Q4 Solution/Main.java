import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("--------------------------Enter the number of students : --------------------------");
        n = input.nextInt();
        Student students[] = new Student[n];
        for(int i = 0; i < n; i++)
        {
            String name;
            String gender;
            String date_of_birth;
            double cgpa;
            System.out.print("------------------------Name : ---------------------");
            String x = input.nextLine();
            name = input.nextLine();
            System.out.print("---------------------------Gender :---------------------------");
            gender = input.nextLine();
            System.out.print("-----------------------------Date of Birth :--------------------------");
            date_of_birth = input.nextLine();
            System.out.print("--------------------------------Enter CGPA : --------------------------------");
            cgpa = input.nextDouble();
            System.out.println();
            students[i] = new Student(name, gender, date_of_birth, cgpa);
        }
        System.out.println("-------------------------------Information of " + n + " Students :---------------------");
        System.out.println();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Name : " + students[i].name);
            System.out.println("Gender : " + students[i].gender);
            System.out.println("Date of Birth : " + students[i].getDateOfBirth());
            System.out.println("CGPA : " + students[i].getCgpa());
            System.out.println();
        }
    }
}
