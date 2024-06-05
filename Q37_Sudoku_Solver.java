public class Q37_Sudoku_Solver {

    public static void solveSudoku(char[][] board) {
        Sudoku(board);
    }

    public static boolean Sudoku(char[][] board) {
        int row = 0;
        int column = 0;
        boolean isEmptyLeft = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    column = j;
                    isEmptyLeft = true;
                    break;
                }
            }
            if (isEmptyLeft) break;
        }
        if (!isEmptyLeft) return true;

        for (int i = 1; i <= 9; i++) {
            if (isValidPosition(board, row, column, (char) (i + 48))) {
                board[row][column] = (char) (i + 48);
                if (Sudoku(board)) {
                    return true;
                } else {
                    // backtrack
                    board[row][column] = '.';
                }
            }
        }

        return false;
    }

    public static boolean isValidPosition(char[][] board, int row, int column, char number) {
        // checking in the box
        int r = 0;
        int c = 0;
        while (r + 3 <= row) r += 3;
        while (c + 3 <= column) c += 3;

        for (int i = r; i <= r + 2; i++) {
            for (int j = c; j <= c + 2; j++) {
                if (board[i][j] != '.') {
                    if (board[i][j] == number) return false;
                }
            }
        }

        // check in the row and column
        for (int i = 0; i < 9; i++) {
            // searching in row
            if (board[row][i] == number) {
                return false;
            }

            // searching in a column
            if (board[i][column] == number) {
                return false;
            }
        }

        return true;
    }

}
