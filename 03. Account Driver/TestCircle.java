/**
 * A Test Driver for the Circle class
 */
public class TestCircle {
    public static void main(String[] args) {

        System.out.println("Number of Circle Objects: " + Circle.countCircle);
        // Test all constructors
        Circle c1 = new Circle(1.1, "blue");//calls 1st constructor

        System.out.println("The radius of Circle C1 is: "+ c1.getRadius());
        System.out.println("The color of Circle C1 is: "+ c1.getColor());


        Circle c2 = new Circle(2.2);//calls 2nd Constructor

        System.out.println("The radius of Circle C2 is: "+ c2.getRadius());
        System.out.println("The color of Circle C2 is: "+ c2.getColor());

        Circle c3 = new Circle(); //calls default constructor

        System.out.println("The radius of Circle C3 is: "+ c3.getRadius());
        System.out.println("The color of Circle C3 is: "+ c3.getColor());

        System.out.println("Number of Circle Objects: " + Circle.countCircle);

        System.out.println();
        System.out.println("-----------Test Setters and Getters--------");
        System.out.println();

        // Test Setters (Mutator Methods) and Getters (Accessor Methods)

        c1.setRadius(3.3);
        c1.setColor("green");

        System.out.println("The radius of Circle C1 is: " + c1.getRadius());
        //The radius is: 3.3
        System.out.println("The color of Circle C1 is: " + c1.getColor());
        //The color is: green

        // Test calculateArea() and calculateCircumference()

        System.out.printf("The area of C1 is: %.4f%n", c1.calculateArea());
        //The area is: 34.2119

        System.out.printf("The circumference of C1 is: %.2f%n", c1.calculateCircumference());
        //The circumference is: 20.73

        System.out.println();
        System.out.println("------Comparing Circles with respect to Radius and Color---------");
        System.out.println();

        //Design a static method that receives two circle objects and compare

        compareCircles(c1,c2);
        System.out.println();

        compareCircles(c1,c3);
        System.out.println();

        compareCircles(c2,c3);
    }

    static void compareCircles(Circle obj1, Circle obj2)
   {
        //compare radius of the circles
        if(obj1.getRadius() > obj2.getRadius())
        {
            //System.out.println("Circle:1  is larger than Circle:2");
            System.out.println("Circle: "+ obj1.CID +" is larger than Circle: " + obj2.CID);
        }
        else if (obj1.getRadius() < obj2.getRadius())
        {
            //System.out.println("Circle:1  is smaller than Circle:2");
            System.out.println("Circle: "+ obj1.CID +" is smaller than Circle: " + obj2.CID);
        }
        else
        {
            System.out.println("The two Circles have equal radius. The radius is :" + obj1.getRadius());
        }
//
        //compare color (String data type) of the circles
        System.out.println();

       String col1 = obj1.getColor();
       String col2 = obj2.getColor();


       //NOTE: Do not compare String variables/objects using '==' operator.
       // Because, String objects refer to Memory locations. They are Non-primitive/Reference data types.
       // Always use built in equals(Object obj) method in Java Object Class for comparison
       //You can also use built in.. compareTo(String s) or  equalsIgnoreCase(String s) methods of Java Sting class

       //For Primitive (Already defined) data types like int,double,float,boolean you can use '==' operator for comparison
       // Because, they refer to values.

       if(col1.equals(col2)) // Alternate writing option: if(col1.equals(col2) == true)
        {
            System.out.println("The two Circles have same color. The Color is: " + obj1.getColor());
        }
        else
        {
            System.out.println("The two Circles have different color.\nThe Color of circle-1:  is: " + obj1.getColor() + " and the color of circle-2 is: " + obj2.getColor());

        }

       // Alternate option-1:
//
//       if(col1.equalsIgnoreCase(col2)) // Alternate writing option: if(col1.equalsIgnoreCase(col2) == true)
//       {
//           System.out.println("The two Circles have same color. The Color is: " + obj1.getColor());
//
//       }
//       else
//       {
//           System.out.println("The two Circles have different color.\nThe Color of circle-1:  is: " + obj1.getColor() + " and the color of circle-2 is: " + obj2.getColor());
//
//       }

       // Alternate option-2:
//
//       if(col1.compareTo(col2) == 0) //compareTo(String s) method compares the ASCII values of the characters of the String contents
//       {
//           System.out.println("The two Circles have same color. The Color is: " + obj1.getColor());
//
//       }
//       else
//       {
//           System.out.println("The two Circles have different color.\nThe Color of circle-1:  is: " + obj1.getColor() + " and the color of circle-2 is: " + obj2.getColor());
//
//       }

    }

}



