package education;

import java.util.ArrayList;
import java.util.Scanner;

public class AcademySystem {
    private final ArrayList<Course> courses = new ArrayList<>();
    private final ArrayList<Student> students = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public void test() {
        Course co1 = new Course(1, "Java-SE", 5);
        addCourse(co1);
        Course co2 = new Course(2, "Java-EE", 5);
        addCourse(co2);
        Course co3 = new Course(3, "Web Pack", 5);
        addCourse(co3);
        Course co4 = new Course(4, "PHP", 5);
        addCourse(co4);

        Student stu1 = new Student(1, "Arshan");
        addStudent(stu1);
        Student stu2 = new Student(2, "Nika");
        addStudent(stu2);
        Student stu3 = new Student(3, "Mona");
        addStudent(stu3);
        Student stu4 = new Student(4, "Reza");
        addStudent(stu4);
        Student stu5 = new Student(5, "Hashem");
        addStudent(stu5);
        Student stu6 = new Student(6, "Ahmad");
        addStudent(stu6);
    }

    public AcademySystem() {
        menu();
    }

    public void menu() {
        test();
        loop:
        while (true) {
            System.out.println("1.Add course: ");
            System.out.println("2.Add Student: ");
            System.out.println("3.Enroll Student: ");
            System.out.println("4.Report");
            System.out.println("5.Report of a class");
            System.out.println("6.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Title: ");
                    String title = sc.next();
                    System.out.print("Capacity: ");
                    int capacity = sc.nextInt();
                    System.out.print("Code: ");
                    int code = sc.nextInt();
                    addCourse(new Course(code, title, capacity));
                }
                case 2 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Name: ");
                    String name = sc.next();
                    addStudent(new Student(id, name));
                }
                case 3 -> {
                    System.out.println("Enter Course Code: ");
                    int courseid = sc.nextInt();
                    System.out.println("Enter student ID: ");
                    int studentid = sc.nextInt();
                    enroll(studentid, courseid);
                }
                case 4 -> report();
                case 5 -> {
                    System.out.println("Course Code: ");
                    int courseCode = sc.nextInt();
                    Course course =  findCourse(courseCode);
                    reportFromAClass(course,  courseCode);
                }
                case 6 -> {
                    break loop;
                }
                default -> System.err.println("Wrong choice");
            }
        }
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void report() {
        System.out.println("Students: ");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.print("Top Student: ");
        System.out.println(topStudent());
        System.out.println("Courses: ");
        for (Course courses : courses) {
            System.out.println(courses);
        }
    }

    public void reportFromAClass(Course course, int courseCode) {
        System.out.println("Course ID: " + courseCode);
        System.out.println("Course Name: " + course.getTitle());
        System.out.println("Course Fullness: " + course.isFull());
        System.out.println("Course remaining Capacity: " + course.getRemainingCapacity());
        for  (Student student : course.showEnrolled()) {
            System.out.println(student);
        }

    }

    public void enroll(int studentid, int courseid) {
        Course course = findCourse(courseid);
        Student student = findStudent(studentid);

        if (student == null || course == null) {
            System.err.println("Student or Course not found");
        } else if (course.isEnrolled(student)) {
            System.err.println("Already enrolled");
        } else if (course.isFull()) {
            System.err.println("Course is full");
        } else {
            course.enrollInStudent(student);
            student.enrollInCourse(course);
        }
    }

    public Course findCourse(int courseId) {
        for (Course c : courses) {
            if (c.getCode() == courseId) {
                return c;
            }
        }
        return null;
    }

    public Student findStudent(int studentId) {
        for (Student s : students) {
            if (s.getId() == studentId) {
                return s;
            }
        }
        return null;
    }

    public Student topStudent() {
        if (!students.isEmpty()) {
            Student top = students.getFirst();
            for (Student s : students) {
                if (s.courseCount() > top.courseCount()) {
                    top = s;
                }
            }
            return top;
        }
        return null;
    }
}
