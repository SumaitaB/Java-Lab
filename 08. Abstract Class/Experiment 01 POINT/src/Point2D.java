public class Point2D {

    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public Point2D()
    {
        x = x;
        y = y;
    }
    public float getX()
    {
        return x;
    }
    public float getY()
    {
        return y;
    }
    public void setX(float x)
    {
        this.x=x;
    }
    public void setY(float y)
    {
        this.y=y;
    }
    public float[] getXY()
    {
        float[] XY= new float[2];
        XY[0] = x;
        XY[1] = y;
        return XY;

    }
    public void setXY(float x,float y)
    {
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return "[x,y]=" + "("+x+","+y+")";
    }

}
