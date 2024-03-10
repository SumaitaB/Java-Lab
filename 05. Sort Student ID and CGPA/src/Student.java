public class Student {
    // The private instance variables
    private int student_id;
    private double cgpa;


    public Student(int student_id, double st_cgpa) {
        this.student_id = student_id;
        cgpa = st_cgpa;
    }

    public void display() {
        System.out.println("============================================");
        System.out.print("Student ID:" + student_id + ", ");
        System.out.printf("CGPA: %.2f%n", cgpa);
        System.out.println("============================================");

    }
    public Integer getID()
    {
        return student_id;
    }
    public Double getCGPA()
    {
        return cgpa;
    }
}
