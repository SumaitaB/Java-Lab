import java.lang.String;

public class TestDriver_for_SHAPE {
    public static void main(String[] args){

        System.out.println("\n                    CIRCLE\n");
        SHAPE circle=new CIRCLE();
        System.out.println(circle.toString());
        circle.getArea();
        circle.getPerimeter();
        System.out.println("COLOUR : "+circle.getColor());
        System.out.println("The circle is filled: "+circle.filled);


        CIRCLE circle1=new CIRCLE("Blue",false,2.5);
        System.out.println(circle1.toString());
        circle1.getArea();
        circle1.getPerimeter();
        System.out.println("COLOUR: "+circle1.color);
        System.out.println("The circle is filled: "+circle1.filled);


        CIRCLE circle2=new CIRCLE("Black",true,2.5);
        System.out.println(circle2.toString());
        circle2.getArea();
        circle2.getPerimeter();
        System.out.println("The color of the circle is: "+circle2.getColor());
        System.out.println("The circle is filled: "+circle2.filled);


        System.out.println("\n\n                    RECTANGLE\n");

        SHAPE rectangle= new RECTANGLE();
        //Rectangle rectangle=new rectangle();
        System.out.println(rectangle.toString());
        rectangle.getArea();
        rectangle.getPerimeter();
        System.out.println("COLOUR: "+rectangle.getColor());
        System.out.println("The rectangle is filled: "+rectangle.filled);


        RECTANGLE rectangle1= new RECTANGLE("Orange",false,5.2,10.5);
        System.out.println(rectangle1.toString());
        rectangle1.getArea();
        rectangle1.getPerimeter();
        System.out.println("The color of the rectangle is: "+rectangle1.getColor());
        System.out.println("The rectangle is filled: "+rectangle1.filled);


        System.out.println("\n\n                    SQUARE\n");
        RECTANGLE square = new SQUARE(6);
        System.out.println(square.toString());
        square.getArea();
        square.getPerimeter();
        System.out.println("COLOUR: "+square.getColor());
        System.out.println("The square is filled: "+square.filled);












    }


}

