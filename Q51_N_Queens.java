import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q51_N_Queens {

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][];

        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            board[i] = row;
        }

        return solve(n, 0, board);
    }

    public static List<List<String>> solve(int n, int row, char[][] board) {
        List<List<String>> retList = new ArrayList<>();

        // base condition
        if (n == 0) {
            List<String> correctPlacement = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                StringBuilder retString = new StringBuilder();
                for (int col = 0; col < board.length; col++) {
                    retString.append(board[i][col]);
                }
                correctPlacement.add(retString.toString());
            }

            retList.add(correctPlacement);
            return retList;
        }

        // next iteration
        for (int citerator = 0; citerator < board.length; citerator++) {
            if (isConstrained(board, row, citerator)) continue;

            board[row][citerator] = 'Q';
            retList.addAll(solve(n - 1, row + 1, board));

            // backtracking
            board[row][citerator] = '.';
        }
        return retList;
    }

    public static boolean isConstrained(char[][] board, int row, int column) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == 'Q') return true;
            if (row - i >= 0 && column - i >= 0)
                if (board[row - i][column - i] == 'Q') return true;
            if (row - i >= 0 && column + i <= board.length - 1)
                if (board[row - i][column + i] == 'Q') return true;
        }
        return false;
    }

}
