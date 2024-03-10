public class TestVehicle
{
    public static void main(String[] args)
    {
        Car toyota_corolla = new Car(100, "White", "Toyota");
        Car pajero = new Car(800, "Black", "Mitsubishi");
        System.out.println("Information of Toyota Corolla : ");
        System.out.println(" HorsePower: "+toyota_corolla.getHorsePower());
        System.out.println(" Colour: "+toyota_corolla.getColour());
        System.out.println(" Maker: "+toyota_corolla.getMaker());
        System.out.println();
        System.out.println("Information of Pajero : ");
        System.out.println(" HorsePower: "+pajero.getHorsePower());
        System.out.println(" Colour: "+pajero.getColour());
        System.out.println(" Maker: "+pajero.getMaker());
    }
}
