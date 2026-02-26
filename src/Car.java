public class Car extends Vehicle{
    private int seats;
    public Car(String model, double dailyREntalPrice, String id, int seats) {
        super(model, dailyREntalPrice, id);
        this.seats = seats;
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String toString(){
        return getModel() + " | " + "ID: " + getId() + " | " + "Seats: " +getSeats();
    }
}
