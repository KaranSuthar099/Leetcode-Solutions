import java.util.Arrays;

public class Q75_Sort_Colors {
    public static void sortColors(int[] nums) {
        int start = 0;
        int middle = 0;
        int end = nums.length - 1;

        while (middle <= end) {
            if (nums[middle] == 2) {
                //swap values at start and at end
                int container = nums[middle];
                nums[middle] = nums[end];
                nums[end] = container;

                end--;
            } else if (nums[middle] == 0) {
                //swap the values at middle and start
                int container = nums[middle];
                nums[middle] = nums[start];
                nums[start] = container;
                start++;
                middle++;
            } else if (nums[middle] == 1) middle++;
        }

    }

    public static void main(String[] args) {
        int[] ary = {1, 1, 1, 1, 0, 0, 2, 0, 1, 2, 1, 2, 0, 0, 0, 0, 2, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 0, 2, 1 };
        sortColors(ary);
        System.out.println(Arrays.toString(ary));
    }
}
