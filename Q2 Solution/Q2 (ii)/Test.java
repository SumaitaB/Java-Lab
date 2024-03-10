class Test
{
    static int count = 0;

    Test()
    {
        count++;
    }

    static void resetCount()
    {
        count = 0;
    }

    public static void main(String arr[])
    {
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println("count = " + t1.count);
        t1.count++;
        System.out.println("count = " + t2.count);
        t2.count++;

        System.out.println("count = " + Test.count);
        resetCount();
        System.out.println("count = " + t1.count);
        System.out.println("count = " + t2.count);
    }
}