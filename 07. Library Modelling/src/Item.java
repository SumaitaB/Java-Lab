class Item
{
    private int id;
    public String title;

    public Item(int i, String t) // constructor
     {
        this.id = i;
        this.title =t;
     }
    protected int getid()
    {
        return id;
    }
    void display()
    {
        System.out.println(id+" "+title);
    }
}
