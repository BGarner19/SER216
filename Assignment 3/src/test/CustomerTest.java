package test;

import core.Customer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * This class is a test class for the Customer class. All that it tests is that the proper formatted string is returned
 * for both of the display address methods. Because the address labels are displayed and given as Strings, there is not
 * anything else to test because there is no validity checks or anything on the strings. Thus, as long as the method
 * returns the correct format of strings then it is a working method.
 *
 * @author Bailey Garner
 * @version 1.0.0 February 7, 2018
 */

public class CustomerTest {

    private Customer customer;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * Sets up the test fixture (Called before every test case method.)
     */

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Bailey Garner", "501 E. Tyler Mall");
        customer.setCity("Tempe");
        customer.setState("AZ");
        customer.setZip("85281");

    }

    /**
     * Tears down the test fixture (Called after every test case method.)
     */

    @After
    public void tearDown() throws Exception {
        customer = null;
    }

    /**
     * Tests that the address is displayed properly. Because every part of this method is strings it doesn't really
     * matter what the variable values are.
     */

    @Test
    public void testDisplayAddress() {
        assertEquals("501 E. Tyler Mall, Tempe, AZ 85281", customer.displayAddress());
    }

    /**
     * Tests that the address label is displayed properly with the name. Because the variables are all strings with no
     * validity checks in theory anything that is a valid string can be returned from this test.
     */

    @Test
    public void testDisplayAddressLabel() {
        assertEquals("Bailey Garner: 501 E. Tyler Mall, Tempe, AZ 85281", customer.displayAddressLabel());
    }








}