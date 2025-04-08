package infrastructure;

public class Venue {

    private String name;
    private String phoneNumber;

    public Venue() {
    }

    public Venue(String name) {
        this.name=name;
    }

    public Venue(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
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

    @Override
    public String toString() {
        return "Venue:" + name + "," + phoneNumber;
    }
}
