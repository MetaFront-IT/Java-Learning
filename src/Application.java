import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private final Scanner input = new Scanner(System.in);
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<RentalRecord> rentalRecords = new ArrayList<>();

    public void insertFakeInput() {
        customers.add(new Customer("Arshan", "09929849211", "0441854222"));
        vehicles.add(new Car("Benz S500", 150, "BS5001", 5));
    }

    Application() {
        vehicles = fileHandler.loadVehicles();
        customers = fileHandler.loadCustomers();
        rentalRecords = fileHandler.loadRentals(customers, vehicles);
        loop:
        while (true) {
            System.out.println("1. Manage Vehicles");
            System.out.println("2. Manage Customers");
            System.out.println("3. Reservation");
            System.out.println("0. Exit and Save");

            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1 -> manageVehicles();
                case 2 -> manageCustomers();
                case 3 -> addReservation();
                case 0 -> {
                    fileHandler.saveVehicles(vehicles);
                    fileHandler.saveCustomers(customers);
                    fileHandler.saveRentals(rentalRecords);
                    break loop;
                }
                default -> System.out.println("Invalid input");
            }
        }
    }

    public void manageVehicles() {
        System.out.println("1. add a vehicle");
        System.out.println("2. list all vehicles");
        System.out.println("3. delete a vehicle");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice) {
            case 1 -> addVehicle();
            case 2 -> {
                if (!vehicles.isEmpty()) {
                    for (Vehicle vehicle : vehicles) {
                        System.out.println(vehicle);
                    }
                } else {
                    System.out.println("Null");
                }
            }
            case 3 -> {
                System.out.print("ID: ");
                String id = input.next();
                if (searchCars(id) != -1) {
                    vehicles.remove(searchCars(id));
                } else {
                    System.out.println("Invalid ID");
                }
            }
            default -> System.out.println("Invalid input");
        }
    }

    public void addVehicle() {
        String model;
        while (true) {
            try{
                System.out.print("Model: ");
                model = input.nextLine();
                if(model.isEmpty()){
                    throw new CustomErrors("Invalid input");
                } else {
                    break;
                }
            } catch (CustomErrors e) {
                System.err.println(e.getMessage());
            }
        }


        System.out.print("Price: ");
        double price = input.nextDouble();
        input.nextLine();


        String id;
        while (true) {
            try {
                System.out.print("ID: ");
                id = input.nextLine();
                if (searchCars(id) != -1) {
                    throw new CustomErrors("Vehicle already exists");
                } else if (id.isEmpty()) {
                    throw new CustomErrors("Invalid input");
                } else {
                    break;
                }
            } catch (CustomErrors e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Seats: ");
        int seats = input.nextInt();
        input.nextLine();

        vehicles.add(new Car(model, price, id, seats));

    }

    public int searchCars(String id) {
        int i = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId().equalsIgnoreCase(id)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int searchCustomers(String nationalID) {
        int i = 0;
        for (Customer customer : customers) {
            if (customer.getNationalId().equalsIgnoreCase(nationalID)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void manageCustomers() {
        System.out.println("1. add a customer");
        System.out.println("2. list all customers");

        int choice = input.nextInt();
        input.nextLine();
        switch (choice) {
            case 1 -> addCustomer();
            case 2 -> {
                if (!customers.isEmpty()) {
                    for (Customer customer : customers) {
                        System.out.println(customer);
                    }
                } else {
                    System.out.println("Null");
                }
            }
            default -> System.out.println("Invalid input");
        }
    }


    public void addCustomer() {
        String name;
        while(true) {
            try{
                System.out.print("name: ");
                name = input.nextLine();
                if (name.isEmpty()){
                    throw new CustomErrors("Invalid input");
                } else  {
                    break;
                }
            }  catch (CustomErrors e) {
                System.err.println(e.getMessage());
            }
        }


        String phoneNumber;
        String nationalID;
        while (true) {
            try {
                System.out.print("phoneNumber: ");
                phoneNumber = input.nextLine();
                if (phoneNumber.length() != 11) {
                    throw new CustomErrors("Invalid phone number (Must be 11 digits)");
                } else {
                    break;
                }
            } catch (CustomErrors e) {
                System.err.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("nationalID: ");
                nationalID = input.nextLine();


                if (nationalID.length() != 10) {
                    throw new CustomErrors("Invalid national ID (Must be 11 digits)");
                } else if (searchCustomers(nationalID) != -1) {
                    throw new CustomErrors("Customer already exists");
                } else {
                    break;
                }
            } catch (CustomErrors e) {
                System.err.println(e.getMessage());
            }
        }

        customers.add(new Customer(name, phoneNumber, nationalID));
    }

    public void addReservation() {
        String id;
        String nationalID;
        int days;
        while (true) {
            try {
                System.out.print("Car ID: ");
                id = input.nextLine();


                if (searchCars(id) == -1) {
                    throw new CustomErrors("Invalid ID");
                } else {
                    break;
                }
            } catch (CustomErrors e) {
                System.err.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Customer national ID: ");
                nationalID = input.nextLine();


                if (searchCustomers(id) == -1) {
                    throw new CustomErrors("Customer does not exist");
                } else {
                    break;
                }
            } catch (CustomErrors e) {
                System.err.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("days: ");
                days = input.nextInt();
                input.nextLine();
                if (days < 0) {
                    throw new CustomErrors("Invalid days");
                } else {
                    break;
                }
            } catch (CustomErrors e) {
                System.err.println(e.getMessage());
            }
        }
        rentalRecords.add(new RentalRecord(customers.get(searchCustomers(nationalID)), days, vehicles.get(searchCars(id))));

    }
}
