public class TestDriver_for_Points
{
    public static void main(String[] args)
    {

        Point2D p1=new Point2D();
        Point2D p2= new Point2D((float) 5.2, (float) 6.3);

        System.out.println("The 2D Points : "+p1+"");
        System.out.println("The 2D Points : "+p1.toString());
        System.out.println("The 2D Points : "+p2.toString());

        float[] temp = p2.getXY();

        System.out.println("x = "+temp[0]+", "+"y = "+temp[1]);
        System.out.println(p1);          // toString() method call

        p2.setX((float) 10.5);
        p2.setY((float) 20.1);

        System.out.println("Values after Modification: [x = " +p2.getX()+ " , y = "+p2.getX()+"]");
        p1.setXY((float)25.5,(float)50.5);
        System.out.println("Values after Modification: [x = " +p1.getX()+ " , y = "+p1.getX()+"]");
        Point3D p3=new Point3D();

        Point3D p4=new Point3D((float)1.2,(float)2.3,(float)3.4);

        System.out.println("Point 3D: "+p4);

        float[] temp1 = p4.getXYZ();

        System.out.println("x = "+temp[0]+", "+"y = "+temp[1]+"y = "+temp[1]);

        System.out.println(p3); // toString() method call

        p4.setX((float) 100.3);
        p4.setY((float) 200.5);
        p4.setZ((float) 300.9);

        System.out.println("Values after Modification: [x,y,z] = "+"["+p4.getX()+","+p4.getY()+","+p4.getZ()+"]");

    }
}
