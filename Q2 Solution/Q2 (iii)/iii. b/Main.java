class Grandparent
{
    Grandparent() {
    System.out.println("Grandparent's Print()"); }
}

class Parent extends Grandparent
{
    Parent() {
    System.out.println("Parent's Print()"); }
}

class Child extends Parent{
     Child() {
        System.out.println("Child's Print()"); }
}

public class Main
{
    public static void main(String[] args) {
        Child c = new Child(); }
}