public class BMI {
    public static void main(String[] args) {
//        Start
//        Input
        String Name =  IO.readln("Name: ");
        int Age = Integer.parseInt(IO.readln("Age: "));
        boolean marriageStatus = Boolean.parseBoolean(IO.readln("Marriage Status (true/false)"));
        double Height = Double.parseDouble(IO.readln("Height (Meters) :"));
        int Weight = Integer.parseInt(IO.readln("Weight (KiloGrams): "));
        String marriageText = "Marriage Status: ";
//        output Name and Age
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
//        Marriage Status Conditions and outputs
        if  (marriageStatus) {
            System.out.println(marriageText + "Married");
        }else if (!marriageStatus){
            System.out.println(marriageText + "Not Married");
        }else {
            System.out.println(marriageText + "Unknown");
        }
//        Output Height and Weight
        System.out.println("Height: " + Height);
        System.out.println("Weight: " + Weight);
//        BMI Calculating and output
        double BMI;
        if(Height > 0 && Weight > 0){
            if (Height < 5 && Weight < 500){
                BMI = Weight / (Height * Height);
                if (BMI > 24 && BMI < 100){
                    System.out.println("BMI is Over");
                }else if (BMI <= 24 && BMI > 18){
                    System.out.println("BMI is normal");
                }else if (BMI <= 18 && BMI > 16){
                    System.out.println("BMI is Less");
                }else{
                    System.out.println("BMI is Not Valid");
                }
            }
        }else {
            System.out.println("Error");
            System.out.println("There is An incorrect input in Height or Weight.");
        }
//        End
    }
}