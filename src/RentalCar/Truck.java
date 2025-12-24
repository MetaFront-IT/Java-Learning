package RentalCar;

import java.util.ArrayList;

public class Truck extends Machine {
    int maxLoad = 1000;

    public Truck(int fuel) {
        super(fuel);
    }

    public void load(int load) {
        if  (load > maxLoad) {
            System.err.println("OverLoaded!");
        } else {
            System.out.println("Loaded");
        }
    }
}
