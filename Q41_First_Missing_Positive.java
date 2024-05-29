import java.util.Arrays;

public class Q41_First_Missing_Positive {
    public static void main(String[] args) {
        int[] nums = {2, 1};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        // with zero based indexing
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i || nums[i] < 0 || nums[i] >= nums.length) i++;
            else if (nums[i] == nums[nums[i]]) i++;
            else {
                // swap with correct index
                int container = nums[i];
                nums[i] = nums[nums[i]];
                nums[container] = container;
            }
        }
        System.out.println(Arrays.toString(nums));

        int missingPositive = 1;

        for (i = 0; i < nums.length; i++) {
            if (nums[i] == missingPositive ) missingPositive++;
        }
        for (i = nums.length -1; i >= 0 ; i--) {
            if (nums[i] == missingPositive ) missingPositive++;
        }
        return missingPositive;
    }

}
