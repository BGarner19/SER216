import java.util.ArrayList;

public class MagicSquare {

    private int[][] square;
    private int squareSize;

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

    public boolean isMagic() {

        int[] rowSums = new int[squareSize];
        int [] colSums = new int[squareSize];
        int[] diagSums = new int[2];

        //SumRows

        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++) {
                rowSums[i] += square[i][j];
            }
        }

        //SumColumns

        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++) {
                colSums[j] += square[i][j];
            }
        }

        //SumDiagonals

        for (int i = 0; i < squareSize; i++) {

            diagSums[0] += square[i][i];
        }

        for (int i = squareSize - 1; i >= 0; i--) {
            diagSums[1] += square[i][i];
        }


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

        return diagSums[0] == rowSums[0] && diagSums[0] == colSums[0] && colSums[0] == rowSums[0];
    }
}
