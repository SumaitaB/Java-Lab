public class Student
{
    public String name;
    public String gender;
    private String ___DATE_OF_BIRTH___;
    private double ___CGPA___;

    public Student(String name, String gender, String dateOfBirth, double cgpa)
    {
        this.name = name;
        this.gender = gender;
        this.___DATE_OF_BIRTH___ = dateOfBirth;
        this.___CGPA___ = cgpa;
    }

    public String getDateOfBirth()
    {
        return ___DATE_OF_BIRTH___;
    }

    public double getCgpa()
    {
        return ___CGPA___;
    }
}
