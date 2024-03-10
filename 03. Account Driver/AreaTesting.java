public class TestDriver {

    public static void main(String[] args) {
        Area rectangle = new Area();

        System.out.println("Area of a rectangle: " + rectangle.computeArea(5.2, 3));

        Area circle = new Area();

        System.out.println("Area of a circle: " + circle.computeArea(5.2));
    }

}

//Q.	Write a class named Area based on the following:
//        a.	No data member of a class is needed.
//        b.	Use the overloaded method getArea() to compute area of a rectangle and circle.
//        c.	Use floating-point numbers (double) as parameters as well as return types.
//        d.	Use Math.PI to compute area of a circle.
//        Write another class named AreaTesting to verify the correctness of all the methods in the above class.