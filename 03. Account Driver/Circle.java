/**
 * The Circle class models a circle with a radius and color.
 */
class Circle {    // Save as "Circle.java"
    // The public constants
    public static final double DEFAULT_RADIUS = 1.0;
    public static final String DEFAULT_COLOR  = "red";

    public static int countCircle;

    // The private instance variables
    private double radius;
    private String color;
    
    public int CID;

    // The (overloaded) constructors
    /** Constructs a Circle with default radius and color */
    public Circle() {                   // 1st (default) Constructor
        radius = DEFAULT_RADIUS;
        color  = DEFAULT_COLOR;
        countCircle++;
        CID = countCircle;

    }
    /** Constructs a Circle with the given radius and default color */
    public Circle(double r) {      // 2nd Constructor

        radius = r;
        color = DEFAULT_COLOR;
        countCircle++;
        CID = countCircle;
    }
    /** Constructs a Circle with the given radius and color */
    public Circle(double radius, String color) { // 3rd Constructor
        this.radius = radius;
        this.color = color;
        countCircle++;
       CID = countCircle;
    }

    /** Returns the radius - the public getter for private variable radius. */
    public double getRadius() {
        return radius;
    }
    /** Sets the radius - the public setter for private variable radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /** Returns the color - the public getter for private variable color */
    public String getColor() {
        return color;
    }
    /** Sets the color - the public setter for private variable color */
    public void setColor(String color) {
        this.color = color;
    }



    /** Returns the area of this Circle */
    public double calculateArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    /** Returns the circumference of this Circle */
    public double calculateCircumference() {
        double circum = 2.0 * radius * Math.PI;
        return circum;
    }


}

