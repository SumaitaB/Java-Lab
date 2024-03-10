import java.util.Scanner;
public class TestDriver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        double rad = input.nextDouble();
        circle circarea = new circle(rad);
        System.out.println("Creating a Circle … done!");
        circarea.space();

        System.out.println("Enter radius of the sphere");
        double rr = input.nextDouble();
        sphere spherevol = new sphere(rr);
        spherevol = new sphere(rr);
        System.out.println("Creating a Sphere … done!");
        spherevol.space();

    }

}
