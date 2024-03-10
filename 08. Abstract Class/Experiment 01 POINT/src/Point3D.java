public class Point3D extends Point2D
{

    private float z = 0.0f;
    public Point3D(float x,float y,float z)
    {
        this.z=z;
    }
    public Point3D()
    {
        this.z=z;
    }
    public float getZ()
    {
        return z;
    }
    public void setZ(float z)
    {
        this.z=z;
    }
    public float[] getXYZ()
    {
        float[] XYZ= new float[5];
        XYZ[0] = getX();
        XYZ[1] = getY();
        XYZ[2] = z ;

        return XYZ;

    }
    public void setXYZ(float x,float y,float z)
    {
        this.z=z;
    }
    public String toString()
    {
        return "(x,y,z)="+"("+getX()+","+getY()+","+z+")";
    }

}
