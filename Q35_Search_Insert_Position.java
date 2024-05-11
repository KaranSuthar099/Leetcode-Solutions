public class Q35_Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length-1]) return nums.length;
        if (target < nums[0]) return 0;

        int left = 0;
        int right = nums.length -1;
        int middle = -1;
        while (right - left != 1){
            middle = (right-left) /2 + left;
            if (nums[middle] < target)
                left = middle;
            else if ( nums[middle] > target)
                right = middle;
            else if (nums[middle] == target) return middle;
        }

        if ( nums[left] == target) return left;

        return right;
    }
}
