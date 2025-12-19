package education;

import java.util.ArrayList;

public class Student {
    private final int id;
    private final String name;
    private final ArrayList<Course> enrolledCourses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        enrolledCourses = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
    }

    public int courseCount() {
        return enrolledCourses.size();
    }

    public String toString() {
        return "- Name: " + name + " ID: " + id;
    }
}
