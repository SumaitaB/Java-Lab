class shape
{
    private double radius;
    shape( double r)
    {
        radius = r;
    }
    double space ()
    {
        System.out.println("Space for a shape can’t be defined");
        return 0;
    }

    protected double getRadius()
    {
        return radius;
    }
}
// creating new circle sub class

class circle extends shape
{

    circle(double x) {
        super(x); //calling parent class's constructor
    }
   double space() //overriding parent version
   {
       double r= getRadius();
       double area=r*r*3.14159;
       System.out.println("Area = " +area);
        return area;
    }

}
// creating new sphere sub class

class sphere extends shape
{

    sphere(double x) {
        super(x); //calling parent class's constructor
    }
    double space() //overriding parent version
    {
        double r= getRadius();
        double area=((4/3.00)*3.14159*(r*r*r));
        System.out.println("Area = " +area);
        return area;
    }

}

