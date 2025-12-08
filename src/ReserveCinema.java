import java.util.Scanner;

public class ReserveCinema {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] rows = new int[5][10];
        while (true) {
            System.out.println("1.Show current seats status");
            System.out.println("2.Reserve a seat");
            System.out.println("3.Show available and un available seats count");
            System.out.println("4.Exit");
            System.out.print("Select an option:");
            int chosenOption = input.nextInt();
            if (chosenOption == 1) {
                for (int i = 1; i <= 10; i++) {
                    System.out.print(i + "\t");
                }
                System.out.println();
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (rows[i][j] == 1) {
                            System.out.print("X" + "\t");
                        } else {
                            System.out.print("O" + "\t");
                        }
                    }
                    System.out.println();
                }
            } else if (chosenOption == 2) {
                System.out.println("which row? (Numbers Only)");
                int chosenRow = input.nextInt();
                System.out.println("which seat?");
                int chosenSeat = input.nextInt();
                if (chosenRow < 1 || chosenRow > 5 || chosenSeat < 1 || chosenSeat > 10) {
                    System.out.println("Invalid row or seat number!");
                    continue;
                }
                if (rows[chosenRow - 1][chosenSeat - 1] == 1) {
                    System.out.println("This seat is already chosen");
                } else {
                    rows[chosenRow - 1][chosenSeat - 1] = 1;
                }
            } else if (chosenOption == 3) {
                int reserved = 0;
                int avalible = 0;
                for (int r = 0; r < 5; r++) {
                    for (int s = 0; s < 10; s++) {
                        if (rows[r][s] == 1) {
                            reserved++;
                        } else {
                            avalible++;
                        }
                    }
                }
                System.out.println("Reserved: " + reserved);
                System.out.println("Available: " + avalible);
            } else if (chosenOption == 4) {
                break;
            } else {
                System.err.println("Unavailable");
            }
        }
    }
}
