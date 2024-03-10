public class Circle extends Shape {

    protected double radius;
    public Circle()
    {
        radius =1.0;
    }
    public Circle(double r)
    {
         this.radius=r;
    }

    public Circle(String C,boolean F,double R) {
        this.color=C;
        this.filled=F;
        this.radius=R;

    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double r)
    {
        this.radius=r;
    }

    public void getArea()
    {

        System.out.println("The Area of circle is: "+(Math.PI*radius*radius)+" square meter");
    }
    public void getPerimeter()
    {
        System.out.println("The Perimeter of circle is: "+(2*Math.PI*radius)+" meter");
    }
    public String toString()
    {
        return "A circle with radius "+radius+" meter";
    }

}
