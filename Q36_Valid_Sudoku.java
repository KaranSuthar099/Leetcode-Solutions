public class Q36_Valid_Sudoku {

    public static boolean isValidSudoku(char[][] board) {
        // this is to check the rows and columns
        for (int i = 0; i < board.length; i++) {
            boolean[] setRow = new boolean[9];
            boolean[] setColumn = new boolean[9];

            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' ){
                    int elementRow = board[i][j] - '0';

                    if (setRow[elementRow-1]) return false;
                    else setRow[elementRow-1] = true;
                }

                if (board[j][i] != '.' ){
                    int elementColumn = board[j][i] - '0';

                    if ( setColumn[elementColumn-1]) return false;
                    else setColumn[elementColumn-1] = true;
                }
            }
        }

        // to check for individual box
        // indexTop = {row , column}
        int[] indexTop = {0, 0};
        while (indexTop[0] < 9 ) {
            boolean[] setBox = new boolean[9];

            for ( int i = indexTop[1]; i<= indexTop[1]+2; i++){
                for ( int j = indexTop[0]; j<= indexTop[0]+2; j++){
                    if (board[j][i] != '.' ){
                        int element = board[j][i] - '0';

                        if ( setBox[element - 1]) return false;
                        else setBox[element -1] = true;
                    }
                }

            }
            indexTop[1] += 3;
            if (indexTop[1] == 9) {
                indexTop[0] += 3;
                indexTop[1] = 0;
            }
        }

        return true;
    }

}
