public class Vehicle {
    private String model;
    private double dailyREntalPrice;
    private String id;

    public Vehicle(String model, double dailyREntalPrice, String id) {
        this.model = model;
        this.dailyREntalPrice = dailyREntalPrice;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDailyREntalPrice() {
        return dailyREntalPrice;
    }

    public void setDailyREntalPrice(double dailyREntalPrice) {
        this.dailyREntalPrice = dailyREntalPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
