public class Customer {
    private String name;
    private String phoneNumber;
    private String nationalId;

    public Customer(String name, String phoneNumber, String nationalId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.nationalId = nationalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String toString(){
        return getName() + " | " + getPhoneNumber() + " | " + getNationalId();
    }
}
