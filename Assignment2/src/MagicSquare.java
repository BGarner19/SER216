import java.util.ArrayList;

public class MagicSquare {

    private int[][] square;

    public MagicSquare(ArrayList<Integer> numbers) {

        int squareSize = (int) Math.sqrt(numbers.size());

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

        return true;
    }


}
