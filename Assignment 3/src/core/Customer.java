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

    /**
     *
     * @return name parameter of the customer
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @param name name of the customer
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return customer street address
     */

    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     *
     * @param streetAddress street address of customer
     */

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    /**
     *
     * @return city of customer
     */

    public String getCity() {
        return city;
    }

    /**
     *
     * @param city city of customer
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return state of customer
     */

    public String getState() {
        return state;
    }

    /**
     *
     * @param state state of customer
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @return zipcode of customer
     */

    public String getZip() {
        return zip;
    }

    /**
     *
     * @param zip zipcode of customer
     */

    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     *
     * @return age of customer
     */

    public int getAge() {
        return age;
    }

    /**
     *
     * @param age age of customer
     */

    public void setAge(int age) {
        this.age = age;
    }
}
