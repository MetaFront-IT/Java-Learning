public class elevator {
    public static void main(String[] args){
        int currentFloor = 5;
        boolean holdButton = Boolean.parseBoolean(IO.readln("Is Hold Button Active: "));
        int targetFloor = Integer.parseInt(IO.readln("Please Select a Floor: "));
        if (targetFloor >= 1 && targetFloor <= 5){
            if (!holdButton) {
                if (currentFloor == targetFloor) {
                    System.out.println("You already are in Target Floor");
                }
                while (currentFloor > targetFloor) {
                    currentFloor -= 1;
                    System.out.println(currentFloor);
                }
                while (currentFloor < targetFloor) {
                    currentFloor += 1;
                    System.out.println(currentFloor);
                }
            } else {
                if (currentFloor > targetFloor) {
                    currentFloor -= 1;
                    System.out.println(currentFloor);
                } else if (currentFloor < targetFloor) {
                    currentFloor += 1;
                    System.out.println(currentFloor);
                } else if (currentFloor == targetFloor) {
                    System.out.println("You already are in Target Floor");
                }
            }
        } else {
            System.out.println("floor is not in Range");
        }
    }
}
