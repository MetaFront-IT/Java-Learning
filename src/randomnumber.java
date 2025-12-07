public class randomnumber {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 101);
        int userInput;
        int triedTimes = 0;
        boolean hardMode = Boolean.parseBoolean(IO.readln("HordMode (true/false) : "));
        loop:
        do {
            userInput = Integer.parseInt(IO.readln("Enter a number: "));
            triedTimes += 1;
            if (hardMode){
                if (triedTimes == 7) {
                    System.out.println("Game Over!");
                    System.out.println("you've reached your limit (7 times)!");
                    System.out.println("Random number was: " + randomNumber);
                    break loop;
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
            System.out.println("you've tried : " + triedTimes);
        } while (userInput != randomNumber);
    }
}
