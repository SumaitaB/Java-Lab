import java.util.Scanner;
public class Driver_Student
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of students:");
        int n = input.nextInt();

        Student idHolder[] = new Student[n];

        for (int i = 0; i < idHolder.length; i++) {
            //String token = input.nextLine();
            System.out.println("***************************************************");
            System.out.println("------ Input Information of Student::" + (i + 1) + " -----");
            System.out.println("***************************************************");

            System.out.print("Please Enter Student's ID:");
            int id = input.nextInt();
            System.out.print("Please Enter Student's CGPA:");
            double cg = input.nextDouble();
            idHolder[i] = new Student(id, cg);
        }

        System.out.println();

        System.out.println("-------Displaying all Students' Information WITHOUT Sorting-------");

        for (int i = 0; i < idHolder.length; i++) {
            System.out.println("-------------Student::" + (i + 1) + "----------------------");
            idHolder[i].display();
        }

        System.out.println();

        sortByID(idHolder);

        sortByCGPA(idHolder);
    }

    // SORTING IN ASCENDING ORDER ACCORDING TO ID
    static void sortByID(Student[] idHolder) {
        for(int i=1;i<=idHolder.length-1;i++)
        {
            for(int j=0;j<=idHolder.length-i-1;j++)
            {  if((idHolder[j].getID()) > (idHolder[j+1].getID()))
            {
               Student temp;
                temp = idHolder[j];
                idHolder[j] = idHolder[j+1];
                idHolder[j+1] = temp;
            }
            }
        }

        System.out.println("-------Displaying all Students' Information AFTER Sorting accoring to ID-------");

        for (int i = 0; i < idHolder.length; i++) {
            System.out.println("-------------Student::" + (i + 1) + "----------------------");
            idHolder[i].display();
        }
    }
// SORTING IN ASCENDING ORDER ACCORDING TO CGPA
    static void sortByCGPA(Student[] idHolder) {
        for(int i=1;i<=idHolder.length-1;i++)
        {
            for(int j=0;j<=idHolder.length-i-1;j++)
            {  if((idHolder[j].getCGPA()) > (idHolder[j+1].getCGPA()))
            {
               Student temp;
                temp = idHolder[j];
                idHolder[j] = idHolder[j+1];
                idHolder[j+1] = temp;
            }
            }
        }

        System.out.println("-------Displaying all Students' Information AFTER Sorting accoring to CGPA-------");

        for (int i = 0; i < idHolder.length; i++) {
            System.out.println("-------------Student::" + (i + 1) + "----------------------");
            idHolder[i].display();
        }
    }
    }
