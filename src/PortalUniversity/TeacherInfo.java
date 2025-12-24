package PortalUniversity;

public class TeacherInfo extends UsersInfo {
    private int teacherID;
    private String expertise;

    public TeacherInfo(String userName, String password, String fullName, int teacherID, String expertise) {
        super(userName, password, fullName);
        this.teacherID = teacherID;
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return " User Name: " + userName + " Full Name: " + fullName + " Password: " + password + " Teacher ID: " + teacherID + " Expertise: " + expertise;
    }
}
