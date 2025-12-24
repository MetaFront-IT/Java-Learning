package PortalUniversity;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private final Scanner input = new Scanner(System.in);
    private final ArrayList<StudentInfo> students = new ArrayList<>();
    private final ArrayList<TeacherInfo> teachers = new ArrayList<>();

    public Application() {
        menu();
    }

    public void menu() {
        loop:
        while (true) {
            System.out.println("1. Create a new Student");
            System.out.println("2. Create a new Teacher");
            System.out.println("3. show Students(BETA)");
            System.out.println("4. show Teachers(BETA)");
            System.out.println("5. Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Student Name: ");
                    String userName = input.next();
                    input.nextLine();

                    System.out.print("Enter Password: ");
                    String password = input.next();
                    input.nextLine();

                    System.out.print("Enter Full Name: ");
                    String fullName = input.next();
                    input.nextLine();

                    System.out.print("Enter Entry Year: ");
                    int entryYear = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Grade of Student: ");
                    float grade = input.nextFloat();
                    input.nextLine();

                    StudentInfo student = new StudentInfo(userName, password, fullName, entryYear, grade);
                    addStudent(student);
                }
                case 2 -> {
                    System.out.print("Enter Teacher Name: ");
                    String userName = input.next();
                    System.out.print("Enter Password: ");
                    String password = input.next();

                    System.out.print("Enter Full Name: ");
                    String fullName = input.next();

                    System.out.print("Enter Expertise: ");
                    int expertise = input.nextInt();

                    System.out.print("Enter Teacher ID: ");
                    String teacherID = input.next();

                    TeacherInfo teacher = new TeacherInfo(userName, password, fullName, expertise, teacherID);
                    addTeacher(teacher);
                }
                case 3 -> {
                    showStudents();
                }
                case 4 -> {
                    showTeachers();
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

    public void addStudent(StudentInfo student) {
        students.add(student);
    }

    public void addTeacher(TeacherInfo teacher) {
        teachers.add(teacher);
    }

    public void showStudents() {
        for (StudentInfo student : students) {
            System.out.println(student);
        }
    }

    public void showTeachers() {
        for (TeacherInfo teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
