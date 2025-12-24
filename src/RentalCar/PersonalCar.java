package RentalCar;

public class PersonalCar extends Machine {

    public PersonalCar(int fuel) {
        super(fuel);
    }

    public void openSunroof(){
        System.out.println("Sunroof Opened");
    }
}
