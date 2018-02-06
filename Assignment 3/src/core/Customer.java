package core;

/**
 * The customer class creates a customer using their name and address information. This class is used to return the
 * information of the customer in a formatted style which would be usable as a label.
 *
 * @author Bailey Garner
 * @version 1.0.0 February 6, 2018
 */

public class Customer {

    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private int age;

    /**
     * Constructor creates a Customer object using their name and street address.
     * @param name the name of the customer
     * @param streetAddress the street address of the customer
     */

    public Customer(String name, String streetAddress) {
        this.name = name;
        this.streetAddress = streetAddress;
    }

    /**
     * Formats the customers address
     * @return A string containing the customers address in a nice format
     */

    public String displayAddress() {

        return getStreetAddress() + ", " + getCity() + ", " + getState() + " " + getZip();
    }

    /**
     * Displays the customers address along with their name
     * @return A string containing the customers name and address in a nice label format
     */

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
