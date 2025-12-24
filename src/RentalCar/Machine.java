package RentalCar;

public class Machine {
    protected int fuel;

    public Machine(int fuel) {
        this.fuel = fuel;
    }
    public void showFuel() {
        System.out.println("Fuel Available: " + fuel);
    }

    public void start() {
        System.out.println("Vehicle Has been Started");
    }
}
