package RentalCar;

import java.util.ArrayList;

public class Application {
    private ArrayList<Machine> machines = new ArrayList<>();
    public Application() {
        menu();
    }
    public void menu() {
        PersonalCar car = new PersonalCar(10);
        Truck truck = new Truck(10);
        machines.add(car);
        machines.add(truck);

        for (Machine machine : machines) {
            machine.start();
            machine.showFuel();
        }
        truck.showFuel();
        truck.load(100);
        truck.load(10000);
    }

}
