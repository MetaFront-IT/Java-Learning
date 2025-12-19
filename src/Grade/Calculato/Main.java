package Grade.Calculato;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();

        double[] grades = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Your Grade " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }

        Student student = new Student(name,grades);

        System.out.println("Name: " + name);
        System.out.println("Name: " + student.calcAvrage());
        System.out.println("Min Grade: " + student.minGrade());
        System.out.println("Max Grade: " + student.maxGrade());
        System.out.println("Qualification: "+ student.qualification());
    }
}