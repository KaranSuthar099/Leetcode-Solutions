public class Q35_Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        // simple binary search question
        if (target > nums[nums.length-1]) return nums.length;
        if (target < nums[0]) return 0;

        int left = 0;
        int right = nums.length -1;
        while (left<=right){
            int middle = (right-left) /2 + left;
            if (nums[middle] < target)
                left = middle+1;
            else if ( nums[middle] > target)
                right = middle+1;
            else return middle;
        }
        return right;
    }
}
