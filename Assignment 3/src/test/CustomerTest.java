package test;

import core.Customer;
import org.junit.*;
import static org.junit.Assert.*;

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

    }

    /**
     * Tests that the address is displayed properly.
     */

    @Test
    public void testDisplayAddress() {
        assertEquals("501 E. Tyler Mall, Tempe, AZ 85281", customer.displayAddress());
    }

    /**
     * Tests that the address label is displayed properly with the name.
     */

    @Test
    public void testDisplayAddressLabel() {
        assertEquals("Bailey Garner: 501 E. Tyler Mall, Tempe, AZ 85281", customer.displayAddressLabel());
    }








}