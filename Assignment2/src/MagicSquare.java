import java.util.ArrayList;

/**
 * MagicSquare class builds a MagicSquare and contains all of the methods that are necessary to check if the given
 * square is actually a MagicSquare. It does this using methods that check the sums of the diagonals, the rows, and the
 * columns. A proper MagicSquare will have the exact same sum in each column, row, and diagonal.
 *
 * @author Bailey Garner
 * @version 1.0.0 1/30/2018
 */

public class MagicSquare {

    private int[][] square;
    private int squareSize;
    private int[] rowSums;
    private int[] colSums;
    private int[] diagSums;

    /**
     * The class constructor takes in an ArrayList of integer numbers that are used to build the MagicSquare using a
     * 2D integer array.
     * @param numbers an ArrayList of integer values used to build the MagicSquare
     */

    public MagicSquare(ArrayList<Integer> numbers) {

        squareSize = (int) Math.sqrt(numbers.size());

        square = new int[squareSize][squareSize];

        int num = 0;

        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++) {
                square[i][j] = numbers.get(num);
                num++;
            }
        }
    }

    /**
     * isMagic method checks if the square is a proper MagicSquare using loops to check if the rows, columns, and
     * diagonals sum up to the same value. It accomplishes this using for loops to check each sum against every other
     * sum by storing each sum in an array and then checking that the values in each array are the same value.
     *
     * @return a boolean that is true if the constraints of a MagicSquare are met and false if one of the properties
     * fails
     */

    public boolean isMagic() {

        rowSums = new int[squareSize];
        colSums = new int[squareSize];
        diagSums = new int[2];

        sumRows();
        sumColumns();
        sumDiags();

        //Check if rows are all the same

        for (int i = 1; i < rowSums.length; i++) {
            if (rowSums[i] != rowSums[i - 1]) {
                return false;
            }
        }

        //Check if columns are all the same

        for (int i = 1; i < colSums.length; i++) {
            if (colSums[i] != colSums[i - 1]) {
                return false;
            }
        }

        //Check if diagonals are the same

        if (diagSums[1] != diagSums[0]) {
            return false;
        }

        //Check if diagonals + rows are the same

        return diagSums[0] == rowSums[0] && diagSums[0] == colSums[0];
    }

    /**
     * sumRows sums the rows of the magic square and stores each sum in the private rowSums array
     */

    private void sumRows() {

        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++) {
                rowSums[i] += square[i][j];
            }
        }
    }

    /**
     * sumColumns sums the columns of the magic square and stores each sum in the private colSums array
     */

    private void sumColumns() {
        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++) {
                colSums[j] += square[i][j];
            }
        }
    }

    /**
     * sumDiags sums the two diagonals of the magic square and stores each sum in the private diagSums array
     */

    private void sumDiags() {
        for (int i = 0; i < squareSize; i++) {

            diagSums[0] += square[i][i];
        }

        for (int i = squareSize - 1; i >= 0; i--) {
            diagSums[1] += square[i][i];
        }
    }
}
