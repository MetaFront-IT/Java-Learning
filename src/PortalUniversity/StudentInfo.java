package PortalUniversity;

public class StudentInfo extends UsersInfo {
    private int entryYear;
    private float grade;

    public StudentInfo(String userName, String password,  String fullName, int entryYear, float grade) {
        super(userName, password, fullName);
        this.entryYear = entryYear;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return " User Name: " + userName + " Full Name: " + fullName + " Entry Year: " + " Password: " + password + "Entry Year: " + entryYear +  "Grade: " + grade;
    }
}
