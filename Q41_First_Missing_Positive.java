public class Q41_First_Missing_Positive {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        // with one based indexing
        int i = 0;
        while (i < nums.length) {
            // skip the elemets which are at correct index or
            // less than or equals to  0 and greater than or equals to the length of array
            if (nums[i] - 1 == i || nums[i] - 1 < 0 || nums[i] - 1 >= nums.length) i++;
                // skip the element which cant be placed at the correct index
            else if (nums[i] == nums[nums[i] - 1]) i++;
            else {
                // else swap with correct index
                int container = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[container - 1] = container;
            }
        }

        int missingPositive = 1;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == missingPositive) missingPositive++;
        }
        return missingPositive;
    }

}
