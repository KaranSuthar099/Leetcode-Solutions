public class Q287_Find_the_Duplicate_Number {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 4, 2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        // using cyclic sort
//       0, 1, 2, 3, 4, 5, 6, 7, 8,
//      {3, 1, 3, 4, 2}
        int i = 0;
        while (i < nums.length) {
            if (nums[i] - 1 == i) i++;
            else if (nums[nums[i] - 1] == nums[i]) return nums[i];

            if (nums[i] - 1 != i) {
                int container = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = container;
            }
        }
        return -1;
    }
}
