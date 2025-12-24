package InventorySystem;

public class Mobile extends Device {
    private int simNumber;
    public Mobile(int id, float price, String manufacturer, int simNumber) {
        super(id, price, manufacturer);
        this.simNumber = simNumber;
    }

    public int getSimNumber() {
        return simNumber;
    }

    public void setSimNumber(int simNumber) {
        simNumber = simNumber;
    }

    @Override
    public String toString() {
        return "id: " + id + " manufacturer: " + manufacturer + " Price: " + price + " Sim Card Number: " + simNumber;
    }
}
