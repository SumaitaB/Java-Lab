//A real-world example:
//        Let’s consider the example of vehicles like bicycle, car, bike………,
//        they have common functionalities. So we make an interface and
//        put all these common functionalities. And lets Bicycle, Bike, car ….etc
//        implement all these functionalities in their own class in their own way.

public interface Vehicle {
    // all are the abstract methods.
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
