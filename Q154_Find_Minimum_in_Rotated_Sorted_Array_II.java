public class Q154_Find_Minimum_in_Rotated_Sorted_Array_II {

    public static int findMin(int[] nums) {
        if (nums[0] < nums[nums.length - 1]) return nums[0];

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            // if there are duplicates decrease the range
            if (nums[start] == nums[start + 1]) {
                start++;
                continue;
            } else if (nums[end] == nums[end - 1]) {
                end--;
                continue;
            }

            int middle = start + (end - start) / 2;

            if (nums[middle] >= nums[0]) start = middle + 1;
            else end = middle;
        }
        return nums[start];


    }

}
