class Printed extends Item
{
    public int pages;
    Printed(int i, String t, int p )
    {
        super(i,t); //calling parent class's constructor
        pages=p;
    }

    void display() //overriding parent version
    {
        int ID=getid();
        System.out.println(ID+" "+title+" pages: "+pages);
    }


}