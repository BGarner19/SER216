package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * This class is a test suite that runs the BankAccountTest and CustomerTest classes together to simplify the running
 * of all the junit tests.
 *
 * @author Bailey Garner
 * @version 1.0.0 February 7, 2018
 */

@RunWith(Suite.class)
@SuiteClasses({BankAccountTest.class, CustomerTest.class})
public class LabTestSuite {

}
