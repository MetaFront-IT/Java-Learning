public class BMI {
    public static void main(String[] args) {
//        Start
//        Input
        String Name =  IO.readln("Name: ");
        int Age = Integer.parseInt(IO.readln("Age: "));
        boolean marriageStatus = Boolean.parseBoolean(IO.readln("Marriage Status (true/false)"));
        double Height = Double.parseDouble(IO.readln("Height (Meters) :"));
        int Weight = Integer.parseInt(IO.readln("Weight (KiloGrams): "));
//        output Name and Age
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
//        Marriage Status Conditions and outputs
        if  (marriageStatus) {
            System.out.println("Marriage Status: " + "Married");
        }else if (!marriageStatus){
            System.out.println("Marriage Status: " + "Not Married");
        }else {
            System.out.println("Marriage Status: Unknown");
        }
//        Output Height and Weight
        System.out.println("Height: " + Height);
        System.out.println("Weight: " + Weight);
//        IBM Calculating and output
        double IBM;
        if(Height > 0 && Weight > 0){
            if (Height < 5 && Weight < 500){
                IBM = Weight / (Height * Height);
                if (IBM > 24 && IBM < 100){
                    System.out.println("IBM is Over");
                }else if (IBM <= 24 && IBM > 18){
                    System.out.println("IBM is normal");
                }else if (IBM <= 18 && IBM > 16){
                    System.out.println("IBM is Less");
                }else{
                    System.out.println("IBM is Not Valid");
                }
            }
        }else {
            System.out.println("Error");
            System.out.println("There is An incorrect input in Height or Weight.");
        }
//        End
    }
}