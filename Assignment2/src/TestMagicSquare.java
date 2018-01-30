import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * TestMagicSquare is a main-method class that runs a simple program that collects a list of integer values from a
 * user. The logic checks if n^2 integers are entered, and, if they are, the program creates a MagicSquare object and
 * checks if the square follows the properties of a true MagicSquare. If it does, then the program outputs true,
 * otherwise it outputs false.
 *
 * @author Bailey
 * @version 1.0.0 1/30/2018
 */

public class TestMagicSquare {

    /**
     * The main method runs the program, collects the integer inputs from the user, and checks if the given square is
     * magic or not.
     *
     * @param args command line arguments passed to the main method
     */

    public static void main(String[] args) {

        ArrayList<Integer> squareNumbers = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a list of integer values separated by spaces: ");

        String input = scan.nextLine();

        String[] numbers = input.split(" ");

        try {
            for (String num : numbers) {
                squareNumbers.add(Integer.parseInt(num));
            }

            MagicSquare newSquare = new MagicSquare(squareNumbers);

            if (newSquare.isMagic()) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        catch (NumberFormatException ex) {
            System.out.println("Input invalid. Input must be only integers separated by spaces. False");
        }
    }
}
