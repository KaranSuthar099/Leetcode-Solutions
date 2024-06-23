import java.util.Arrays;

public class Q73_Set_Matrix_Zeroes {

    public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
        for (int i : matrix[0]) {
            if (i == 0) {
                firstRow = true;
                break;
            }
        }

        boolean firstColumn = false;
        for (int[] ints : matrix) {
            if (ints[0] == 0) {
                firstColumn = true;
                break;
            }
        }

        for (int row = 1; row < matrix.length; row++) {
            for (int column = 1; column < matrix[0].length; column++) {
                if (matrix[row][column] == 0) {
                    // then set the row and the column == 0;
                    matrix[0][column] = 0;
                    matrix[row][0] = 0;
                }
            }
        }

        // checking column array
        for (int row = 1; row < matrix.length; row++) {
            if (matrix[row][0] == 0) {
                // then make the whole row = 0;
                for (int column = 1; column < matrix[0].length; column++) {
                    matrix[row][column] = 0;
                }
            }
        }

        for (int column = 1; column < matrix[0].length; column++) {
            if (matrix[0][column] == 0) {
                // then make the whole row = 0;
                for (int row = 1; row < matrix.length; row++) {
                    matrix[row][column] = 0;
                }
            }
        }

        if (firstColumn) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][0] = 0;
            }
        }
        if (firstRow) {
            Arrays.fill(matrix[0], 0);
        }
    }

}
