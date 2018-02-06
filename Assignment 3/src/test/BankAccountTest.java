package test;

import core.BankAccount;
import org.junit.*;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

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
        account = new BankAccount();
        account.setBalance(10000);
    }

    /**
     * Tears down the test fixture (Called after every test case method.)
     */

    @After
    public void tearDown() throws Exception {
        account = null;
    }

    /**
     * Tests that the proper interest for a savings account is returned
     */

    @Test
    public void testSavingsInterest() {
        account.setAccountType(1);

        assertTrue("Savings interest should be .5", .5 == account.getInterestRate());
    }

    /**
     * Tests that the proper interest for an award savings account is returned
     */

    @Test
    public void testAwardSaversInterest() {
        account.setAccountType(2);

        assertTrue("Award savers interest should be 4.5", 4.5 == account.getInterestRate());
    }

    /**
     * Tests that the proper interest for a checking account is returned
     */

    @Test
    public void testCheckingInterest() {
        account.setAccountType(3);

        assertTrue("Checking interest should be 1.0", 1 == account.getInterestRate());
    }

    /**
     * Tests that the proper interest for a credit card account is returned
     */

    @Test
    public void testCreditInterest() {
        account.setAccountType(4);

        assertTrue("Credit interest should be 15", 15 == account.getInterestRate());
    }

    /**
     * Tests that the proper interest for any other type of account is returned. Checks both 0 and a different value
     * outside of the 1-4 settings.
     */

    @Test
    public void testOtherInterest() {
        account.setAccountType(0);

        assertTrue("Other interest should be 0", 0 == account.getInterestRate());

        account.setAccountType(100);

        assertTrue("Other interest should be 0", 0 == account.getInterestRate());
    }

    /**
     * Tests that the proper balance is calculated for a savings account
     */

    @Test
    public void testCalculatedSavingsBalance() {
        account.setAccountType(1);

        assertTrue("Balance calculation should be 10050", 10050 == account.calculateTotalBalance());
    }

    /**
     * Tests that the proper balance is calculated for a award savings account
     */

    @Test
    public void testCalculatedAwardBalance() {
        account.setAccountType(2);

        assertTrue("Balance calculation should be 10450", 10450 == account.calculateTotalBalance());
    }

    /**
     * Tests that the proper balance is calculated for a checking account
     */

    @Test
    public void testCalculatedCheckingBalance() {
        account.setAccountType(3);

        assertTrue("Balance calculation should be 10100", 10100 == account.calculateTotalBalance());

    }

    /**
     * Tests that the proper balance is calculated for a credit card account
     */

    @Test
    public void testCalculatedCreditBalance() {
        account.setAccountType(4);

        assertTrue("Balance calculation should be 11500", 11500 == account.calculateTotalBalance());

    }

    /**
     * Tests that the proper balance is calculated for an "other" type of account
     */

    @Test
    public void testCalculatedOtherBalance() {
        account.setAccountType(0);

        assertTrue("Balance calculation should be 10000", 10000 == account.calculateTotalBalance());

    }


}