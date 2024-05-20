import java.util.ArrayList;
import java.util.List;

public class Q54_Spiral_Matrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        int bound = 0;
        int row = matrix.length;
        int column = matrix[0].length;

        ArrayList<Integer> retList = new ArrayList<>();
        while (bound < row) {
            // adding the first row
            for (int i = bound; i < column - bound; i++) {
                retList.add(matrix[bound][i]);
            }
            if (retList.size() == row * column) break;
            // adding the last column
            for (int i = bound + 1; i < row - bound; i++) {
                retList.add(matrix[i][column - bound - 1]);
            }
            if (retList.size() == row * column) break;
            // adding the last row
            for (int i = column - bound - 2; i > bound; i--) {
                retList.add(matrix[row - bound - 1][i]);
            }
            if (retList.size() == row * column) break;
            // adding the first column
            for (int i = row - bound - 1; i > bound; i--) {
                retList.add(matrix[i][bound]);
            }
            if (retList.size() == row * column) break;

            bound++;
        }
        return retList;
    }

}
