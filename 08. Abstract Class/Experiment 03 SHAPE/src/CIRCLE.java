public class CIRCLE extends SHAPE {

    protected double radius;
    public CIRCLE()
    {
        radius =1.0;
    }
    public CIRCLE(double r)
    {
        this.radius=r;
    }

    public CIRCLE(String C,boolean F,double R) {
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

        System.out.println("Area: "+(Math.PI*radius*radius)+" sq. metre");
    }
    public void getPerimeter()
    {
        System.out.println("Perimeter: "+(2*Math.PI*radius)+" metre");
    }
    public String toString()
    {
        return "Radius "+radius+" metre";
    }

}
