package PortalUniversity;

public class UsersInfo {
    protected String fullName;
    protected String userName;
    protected String password;

    public  UsersInfo(String userName, String password,  String fullName) {
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
    }

}
