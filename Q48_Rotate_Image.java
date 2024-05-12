public class Q48_Rotate_Image {
    public static void swap(int[][] matrix, int i, int j){
        int container = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = container;
    }

    public static void rotate(int[][] matrix) {
        // transpose
        int bound = matrix.length;
        for (int i = 0; i<matrix.length/2; i++ ){
            for (int j = i; j<bound; j++){
                swap(matrix, i, j);
            }
            bound--;
        }
        bound = 1;
        for ( int i = matrix.length-1; i>bound; i-- ){
            for ( int j = bound; j<i; j++){
                swap(matrix, i, j);
            }
            bound++;
        }
        // now reversing individual array
        for (int[] row: matrix ){
            int end = matrix.length-1;
            int index = 0;
            while ( !(end <= index) ){
                int container = row[index];
                row[index++] = row[end];
                row[end--] = container;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        rotate(matrix);
    }



}
