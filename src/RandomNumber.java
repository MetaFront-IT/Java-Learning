public class RandomNumber {
    public static void main(String[] args) {
        byte randomNumber = (byte) (Math.random() * 101);
        int userInput;
        byte triedTimes = 0;
        boolean hardMode = Boolean.parseBoolean(IO.readln("HardMode (true/false) : "));
        do {
            userInput = Integer.parseInt(IO.readln("Enter a number: "));
            triedTimes += 1;
            if (hardMode){
                if (triedTimes == 7) {
                    System.out.println("Game Over!");
                    System.out.println("you've reached your limit (7 times)!");
                    System.out.println("Random number was: " + randomNumber);
                    break;
                }
            }
            if (userInput > randomNumber) {
                System.out.println("Choose a smaller number!");
                continue;
            } else if (userInput < randomNumber) {
                System.out.println("Choose a Bigger number!");
                continue;
            }
            System.out.println("congratulations!");
            System.out.print("you've tried : " + triedTimes + " Times");
            if (hardMode) {
                System.out.println(" in hard mode!");
            }
        } while (userInput != randomNumber);
    }
}
