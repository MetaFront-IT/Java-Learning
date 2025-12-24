package InventorySystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private final ArrayList<Laptop> laptops = new ArrayList<>();
    private final ArrayList<Mobile> mobiles = new ArrayList<>();
    private final Scanner input = new Scanner(System.in);
    public void insertFakeData() {
        laptops.add(new Laptop(1, "Dell", 1200.50f, "Intel i7"));
        laptops.add(new Laptop(2, "HP", 950.00f, "Intel i5"));
        laptops.add(new Laptop(3, "Apple", 2200.99f, "M1"));

        showLaptops();
        System.out.println("Comment for Teacher 'Mobile is empty' and fake ID is created by AI");
        showMobile();
    }
    public Application() {
        menu();
    }

    public void menu() {
        insertFakeData();
        loop: while (true) {
            System.out.println("1.Add Laptop");
            System.out.println("2.Add Mobile");
            System.out.println("3.View Laptops");
            System.out.println("4.View Mobiles");
            System.out.println("5.Exit");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("ID: ");
                    int id = input.nextInt();
                    System.out.print("Price: ");
                    float price = input.nextInt();
                    System.out.print("Manufacturer: ");
                    String manufacturer = input.next();
                    System.out.print("CPU: ");
                    String cpu = input.next();
                    Laptop laptop = new Laptop(id, manufacturer, price, cpu);
                    addLaptop(laptop);
                }
                case 2 -> {
                    System.out.print("ID: ");
                    int id = input.nextInt();
                    System.out.print("Price: ");
                    float price = input.nextInt();
                    System.out.print("Manufacturer: ");
                    String manufacturer = input.next();
                    System.out.print("CPU: ");
                    int simNumber = input.nextInt();
                    Mobile mobile = new Mobile(id, price, manufacturer, simNumber);
                    addMobile(mobile);
                }
                case 3 -> {
                    showLaptops();
                }
                case 4 -> {
                    showMobile();
                }
                case 5 -> {
                    break loop;
                }
                default -> {
                    System.out.println("Invalid choice");
                }
            }
        }
    }

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void addMobile(Mobile mobile) {
        mobiles.add(mobile);
    }

    public void showLaptops() {
        if (laptops.isEmpty()) {
            System.out.println("No laptops found");
        }
        else {
            for (Laptop searched : laptops) {
                System.out.println(searched);
            }
        }
    }

    public void showMobile() {
        if (mobiles.isEmpty()) {
            System.out.println("No mobiles found");
        }
        else {
            for (Mobile searched : mobiles) {
                System.out.println(searched);
            }
        }
    }
}
