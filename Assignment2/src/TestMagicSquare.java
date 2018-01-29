import java.util.ArrayList;
import java.util.Scanner;

public class TestMagicSquare {

    public static void main(String[] args) {

        ArrayList<Integer> squareNumbers = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a list of numbers terminated by any non-integer character: ");

        while (scan.hasNextInt()) {
            squareNumbers.add(scan.nextInt());
        }

        if (isSquare(squareNumbers)) {

            MagicSquare newSquare = new MagicSquare(squareNumbers);

            if (newSquare.isMagic()) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        else {
            System.out.println("false");
        }


    }

    public static boolean isSquare(ArrayList<Integer> numbers) {

        int root = (int) Math.sqrt(numbers.size());

        return (root * root == numbers.size());
    }
}
