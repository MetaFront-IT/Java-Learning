import java.io.*;
import java.util.ArrayList;

public class fileHandler {

    private static final String VEHICLE_FILE = "vehicles.txt";
    private static final String CUSTOMER_FILE = "customers.txt";
    private static final String RENTAL_FILE = "rentals.txt";

    // ================= SAVE METHODS =================

    public static void saveVehicles(ArrayList<Vehicle> vehicles) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(VEHICLE_FILE))) {
            for (Vehicle v : vehicles) {
                // model,price,id,seats
                writer.write(v.getModel() + "," + v.getDailyREntalPrice() + "," + v.getId() + "," + ((Car)v).getSeats());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving vehicles");
        }
    }

    public static void saveCustomers(ArrayList<Customer> customers) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CUSTOMER_FILE))) {
            for (Customer c : customers) {
                // name,phone,nationalId
                writer.write(c.getName() + "," + c.getPhoneNumber() + "," + c.getNationalId());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving customers");
        }
    }

    public static void saveRentals(ArrayList<RentalRecord> rentals) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RENTAL_FILE))) {
            for (RentalRecord r : rentals) {
                // nationalId,carId,days
                writer.write(
                        r.getCustomer().getNationalId() + "," +
                                r.getVehicle().getId() + "," +
                                r.getDays()
                );
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving rentals");
        }
    }

    // ================= LOAD METHODS =================

    public static ArrayList<Vehicle> loadVehicles() {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(VEHICLE_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String model = data[0];
                double price = Double.parseDouble(data[1]);
                String id = data[2];
                int seats = Integer.parseInt(data[3]);

                vehicles.add(new Car(model, price, id, seats));
            }
        } catch (IOException e) {
            System.out.println("No vehicle file found");
        }
        return vehicles;
    }

    public static ArrayList<Customer> loadCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CUSTOMER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                customers.add(new Customer(data[0], data[1], data[2]));
            }
        } catch (IOException e) {
            System.out.println("No customer file found");
        }
        return customers;
    }

    public static ArrayList<RentalRecord> loadRentals(
            ArrayList<Customer> customers,
            ArrayList<Vehicle> vehicles
    ) {
        ArrayList<RentalRecord> rentals = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(RENTAL_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String nationalId = data[0];
                String carId = data[1];
                int days = Integer.parseInt(data[2]);

                Customer customer = null;
                Vehicle vehicle = null;

                for (Customer c : customers)
                    if (c.getNationalId().equals(nationalId))
                        customer = c;

                for (Vehicle v : vehicles)
                    if (v.getId().equals(carId))
                        vehicle = v;

                if (customer != null && vehicle != null)
                    rentals.add(new RentalRecord(customer, days, vehicle));
            }
        } catch (IOException e) {
            System.out.println("No rental file found");
        }
        return rentals;
    }
}
