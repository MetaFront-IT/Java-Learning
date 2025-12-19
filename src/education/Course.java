package education;

import java.util.ArrayList;

public class Course {
    private final int code;
    private final String title;
    private final int capacity;
    private final ArrayList<Student> enrolled;

    public Course(int code, String title, int capacity) {
        this.code = code;
        this.title = title;
        this.capacity = capacity;
        enrolled = new ArrayList<>();
    }

    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }


    public void enrollInStudent(Student student) {
        enrolled.add(student);
    }

    public boolean isFull() {
        return getRemainingCapacity() <= 0;
    }

    public boolean isEnrolled(Student student) {
        return enrolled.contains(student);
    }

    public int getRemainingCapacity() {
        return capacity - enrolled.size();
    }

    public ArrayList<Student> showEnrolled() {
        return enrolled;
    }

    @Override
    public String toString() {
        return "Code: " + code + " Title: " + title + " Capacity: " + getRemainingCapacity();
    }
}
