public class Q268_Missing_Number {

    public static void main(String[] args) {
        //            0, 1, 2, 3, 4, 5, 6, 7, 8,
        int[] nums = {9, 1, 4, 2, 3, 6, 7, 0, 8};
        System.out.println(missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {
        // using cyclic sort
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums.length) {
                while (nums[i] != i && nums[i] != nums.length) {
                    int container = nums[i];
                    nums[i] = nums[nums[i]];
                    nums[container] = container;
                }
            }
        }
        for (int i = 0; i<nums.length; i++){
            if (i != nums[i]) return i;
        }
        return -1;
    }

}
