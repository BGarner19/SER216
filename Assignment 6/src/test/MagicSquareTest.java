package test;

import core.MagicSquare;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class MagicSquareTest {

    private ArrayList<Integer> numbers;
    private MagicSquare magicSquare;

    @Before
    public void setUp() {
        numbers = new ArrayList<>();
    }

    @Test
    public void testAllPass() {
        numbers.addAll(Arrays.asList(8, 1, 6, 3, 5, 7, 4, 9, 2));

        magicSquare = new MagicSquare(numbers, 9);

        assertTrue(magicSquare.isMagic());
    }

    @Test
    public void testWrongNumberOfInputs() {
        numbers.addAll(Arrays.asList(1, 2, 3));

        magicSquare = new MagicSquare(numbers, 3);

        assertFalse(magicSquare.isMagic());
    }

    @Test
    public void testNonUniqueValues() {
        numbers.addAll(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1));

        magicSquare = new MagicSquare(numbers, 1);

        assertFalse(magicSquare.isMagic());
    }

    @Test
    public void testSumsNotEqual() {
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        magicSquare = new MagicSquare(numbers, 9);

        assertFalse(magicSquare.isMagic());
    }
}
