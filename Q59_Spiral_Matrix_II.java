public class Q59_Spiral_Matrix_II {

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int counter = 1;
        int bounds = 0;
        while (true){
            // first row
            for (int i = bounds; i<n-bounds && counter <= n*n; i++){
                matrix[bounds][i] = counter++;
            }
            // last column
            for (int i = bounds +1; i<n- bounds && counter <= n*n; i++){
                matrix[i][n-bounds-1] = counter++;
            }
            //last row
            for (int i = n-bounds-2; i>=bounds && counter <= n*n; i--){
                matrix[n-1-bounds][i] = counter++;
            }
            for (int i = n-bounds-2; i >= bounds+1 && counter <= n*n; i--){
                matrix[i][bounds] = counter++;
            }

            if ( !(counter <= n*n)) break;
            bounds++;
        }
        return matrix;

    }

}
