public abstract class Shape {

    protected String color;
    protected boolean filled;

 public Shape(){
     color="green";
     filled=true;
 }
 public Shape(String c,boolean f)
 {
     this.color=c;
     this.filled=f;
 }
 public String getColor()
 {
     return color;
 }
 public boolean Filled()
 {
     return filled;
 }
 public void setColor(String c)
 {
     this.color=c;
 }

 public void FILLED()
 {
     this.filled=filled;
 }
 public String toString()
 {
     return "A Shape with color of "+color+" and filled/Not filled "+filled;
 }
 //two abstract methods
    abstract void getArea();
    abstract void getPerimeter();



}
