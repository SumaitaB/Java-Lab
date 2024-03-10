public class Square extends Rectangle {

    public Square(double side)
    {
        side=width;
    }
    public Square(String c,boolean f,double s){
        this.color=c;
        this.filled=f;
        this.width=s;
    }
    public void getArea()
    {
        System.out.println("The area of the square is: "+(width*width)+" square meter.");
    }
    public void getPerimeter()
    {
        System.out.println("The perimeter of the square is: "+(4*width)+" meter.");
    }
    public String toString()
    {
        return "A square with side= "+width+" meter";
    }
}
