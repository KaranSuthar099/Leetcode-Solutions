public class Q74_Search_a_2D_Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix[0][0] > target) return false;

        for (int[] list : matrix) {
            // first check if the number is in the range
            int length = list.length - 1;
            if (target >= list[0] && target <= list[length]) {
                // element exist in the range
                int left = 0;
                int right = length;

                if (list[left] == target || list[right] == target) return true;
                while (left + 1 != right) {
                    int middle = left + ((right - left) / 2);

                    if (list[middle] == target || list[left] == target || list[right] == target) return true;
                    else if (target > list[middle]) left = middle;
                    else right = middle;
                }
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchMatrix(matrix, 3));
    }
}
