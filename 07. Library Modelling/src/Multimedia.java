class Multimedia extends Item
{   public int length;
    Multimedia(int i, String t, int l)
    {
        super(i,t); //calling parent class's constructor
        length=l;
    }

    void display() //overriding parent version
    {
        int ID=getid();
        System.out.println(ID+" "+title+" length: "+length+" seconds");
    }


}