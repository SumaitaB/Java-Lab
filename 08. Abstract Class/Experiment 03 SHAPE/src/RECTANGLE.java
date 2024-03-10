public class RECTANGLE extends SHAPE {

    protected double width;
    protected double length;

    public RECTANGLE()
    {
        width=1.0;
        length=1.0;
    }
    public RECTANGLE(String C,boolean F,double W,double L)
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
        System.out.println("Area:"+(width*length)+" sq. metre.");
    }
    public void getPerimeter()
    {
        System.out.println("Perimeter: "+(width+length)+" metre.");
    }
    public String toString()
    {
        return "A rectangle with breadth = "+width+" metre"+","+" and length = "+length+" metre";
    }
}
