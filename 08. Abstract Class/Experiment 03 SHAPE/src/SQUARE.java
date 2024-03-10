public class SQUARE extends RECTANGLE {

    public SQUARE(double side)
    {
        side=width;
    }
    public SQUARE(String c,boolean f,double s){
        this.color=c;
        this.filled=f;
        this.width=s;
    }
    public void getArea()
    {
        System.out.println("Area: "+(width*width)+" sq. metre.");
    }
    public void getPerimeter()
    {
        System.out.println("Perimeter: "+(4*width)+" metre.");
    }
    public String toString()
    {
        return "A square with each side = "+width+" metre";
    }
}
