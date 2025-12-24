package InventorySystem;

public class Laptop extends Device {
    private String cpu;
    public Laptop(int id, String manufacturer, float price , String cpu) {
        super(id, price, manufacturer);
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public  void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "id: " + id + " manufacturer: " + manufacturer + " Price: " + price + " CPU: " + cpu;
    }
}