package test;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.*;

public class CustomerTest {

    private List emptyList;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * Sets up the test fixture (Called before every test case method.)
     */
    public void setUp() throws Exception {
        emptyList = new ArrayList();
    }

    /**
     * Tears down the test fixture (Called after every test case method.)
     */
    public void tearDown() throws Exception {
        emptyList = null;

    }

    @Test
    public void trueAssert() {
        assertTrue(true);
    }
}