public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle()
    {
        width=1.0;
        length=1.0;
    }
    public Rectangle(String C,boolean F,double W,double L)
    {
        this.color=C;
        this.filled=F;
        this.width=W;
        this.length=L;
    }
    public double getWidth()
    {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double w){
        this.width=w;
    }
    public void setLength(double l)
    {
        this.length=l;
    }

    public void getArea()
    {
        System.out.println("The area of rectangle is:"+(width*length)+" square meter.");
    }
    public void getPerimeter()
    {
        System.out.println("The perimeter of rectangle is: "+(width+length)+" meter.");
    }
    public String toString()
    {
        return "A rectangle with width= "+width+" meter"+","+" and length= "+length+" meter";
    }
}
