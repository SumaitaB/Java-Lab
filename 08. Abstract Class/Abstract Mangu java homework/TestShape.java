import java.lang.String;

public class TestShape {
    public static void main(String[] args){

        System.out.println("            ***CIRCLE***");
        System.out.println("-----*****-----");
        Shape circle=new Circle();
        //Or, Circle circle=new Circle();
        System.out.println(circle.toString());
        circle.getArea();
        circle.getPerimeter();
        System.out.println("The color of the circle is: "+circle.getColor());
        System.out.println("The circle is filled: "+circle.filled);
        System.out.println("-----*****-----");

        Circle circle1=new Circle("Blue",false,2.5);
        System.out.println(circle1.toString());
        circle1.getArea();
        circle1.getPerimeter();
        System.out.println("The color of the circle is: "+circle1.color);
        System.out.println("The circle is filled: "+circle1.filled);
        System.out.println("-----*****-----");

        Circle circle2=new Circle("Black",true,2.5);
        System.out.println(circle2.toString());
        circle2.getArea();
        circle2.getPerimeter();
        System.out.println("The color of the circle is: "+circle2.getColor());
        System.out.println("The circle is filled: "+circle2.filled);
        System.out.println("-----*****-----");

        System.out.println("     ***RECTANGLE***");
        System.out.println("-----*****-----");
        Shape rectangle= new Rectangle();
        //Rectangle rectangle=new rectangle();
        System.out.println(rectangle.toString());
        rectangle.getArea();
        rectangle.getPerimeter();
        System.out.println("The color of the rectangle is: "+rectangle.getColor());
        System.out.println("The rectangle is filled: "+rectangle.filled);
        System.out.println("-----*****-----");

        Rectangle rectangle1= new Rectangle("Orange",false,5.2,10.5);
        System.out.println(rectangle1.toString());
        rectangle1.getArea();
        rectangle1.getPerimeter();
        System.out.println("The color of the rectangle is: "+rectangle1.getColor());
        System.out.println("The rectangle is filled: "+rectangle1.filled);
        System.out.println("-----*****-----");

        System.out.println("     ***SQUARE***");
        Rectangle square=new Square(6);
        System.out.println(square.toString());
        square.getArea();
        square.getPerimeter();
        System.out.println("The color of the square is: "+square.getColor());
        System.out.println("The square is filled: "+square.filled);
        System.out.println("-----*****-----");











        }


}

