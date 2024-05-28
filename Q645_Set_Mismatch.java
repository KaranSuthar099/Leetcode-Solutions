import java.util.Arrays;

public class Q645_Set_Mismatch {

    public static void main(String[] args) {
        //            0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        int[] nums = {3, 2, 3, 4, 6, 5};
        System.out.println(Arrays.toString(findErrorNums(nums)));
        System.out.println(Arrays.toString(nums));

    }

    public static int[] findErrorNums(int[] nums) {
        // using cycle sort
        int i = 0;
        while (i < nums.length) {
            if (nums[i] - 1 == i || nums[i] == nums[nums[i] - 1]) i++;
            else {
                // else swap
                int container = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[container - 1] = container;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i+1)
                return new int[] {nums[i], i+1};
        }

        return new int[]{-1, -1,};
    }

}
