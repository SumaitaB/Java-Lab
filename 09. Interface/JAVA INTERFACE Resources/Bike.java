class Bike implements Vehicle {

    int speed;
    int gear;

    // to change gear 
    @Override
    public void changeGear(int newGear){

        gear = newGear;
    }

    // to increase speed 
    @Override
    public void speedUp(int increment){

        speed = speed + 5*increment;
    }

    // to decrease speed 
    @Override
    public void applyBrakes(int decrement){

        speed = speed - 2*decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

} 