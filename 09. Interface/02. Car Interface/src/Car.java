public class Car extends Body implements Engine
{
    private int hp;
    private String maker;
    public Car(int hp, String colour, String maker)
    {
        this.hp = hp;
        this.maker = maker;
        setColour(colour);
    }
    public void setHorsePower(int hpwr)
    {
        hp = hpwr;
    }
    public int getHorsePower()
{
    return hp;
}
public void setMaker(String mk)
{
    maker = mk;
}
public String getMaker()
{
    return maker;
}
}
