import java.util.Arrays;

public class Q167_Two_Sum_II_Input_Array_Is_Sorted {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(twoSum(array, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int part = target - numbers[i];

            int binarySearch = search(numbers, part, i + 1);
            if (binarySearch != -1) {
                return new int[]{i + 1, binarySearch + 1};
            }

        }
        return new int[]{-1, -1};

    }

    public static int search(int[] nums, int target, int start) {
        int end = nums.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (nums[middle] > target) {
                end = middle - 1;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else
                return middle;
        }
        return -1;
    }
}
