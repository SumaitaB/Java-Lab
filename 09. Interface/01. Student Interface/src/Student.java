import java.util.Scanner;
public class Student
{
 Scanner input = new Scanner (System.in);
 private String name;
 private int ID;
 private String address;
 public void setName(String name)
 {
     this.name = name;
 }
 public void setID(int ID)
 {
     this.ID = ID;
 }
 public String getName()
 {
     return name;
 }
 public int getID()
 {
     return ID;
 }
 void setAddress(String address)
 {
     this.address = address;
 }
 String getAddress()
 {
     return address;
 }
}
