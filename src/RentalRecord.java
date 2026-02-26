public class RentalRecord {
    Customer customer;
    int days;
    Vehicle vehicle;
    boolean isActive;
    public RentalRecord(Customer customer, int days, Vehicle vehicle) {
        this.customer = customer;
        this.days = days;
        this.vehicle = vehicle;
        this.isActive = true;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
