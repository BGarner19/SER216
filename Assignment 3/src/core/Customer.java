package core;

public class Customer {

    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private int age;

    public Customer(String name, String streetAddress) {
        this.name = name;
        this.streetAddress = streetAddress;
    }

    public String displayAddress() {

        return getStreetAddress() + ", " + getCity() + ", " + getState() + " " + getZip();
    }

    public String displayAddressLabel() {
        return getName() + ": " + getStreetAddress() + ", " + getCity() + ", " + getState() + " " + getZip();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
