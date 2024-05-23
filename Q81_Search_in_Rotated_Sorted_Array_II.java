public class Q81_Search_in_Rotated_Sorted_Array_II {
    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int first = nums[0];
        int length = nums.length-1;
        boolean targetInFirst = target >= nums[0];

        while (start <= end) {
            int middle = start + (end - start) / 2;


            if (nums[start] == target || nums[end] == target) return true;

            if (start < length && nums[start] == nums[start +1]){
                start ++;
                continue;
            }else if (end > 0 && nums[end] == nums[end-1]){
                end--;
                continue;
            }

            // both the middle and target are in same quadrant
            if (nums[middle] > first && targetInFirst || nums[middle] < first && !targetInFirst){
                // then do the normal binary search
                if (nums[middle] > target) end = middle -1;
                else if (nums[middle] < target) start = middle +1;
                else return true;

            }else if (nums[middle] > first && !targetInFirst){
                // middle is in first quadrant and target is in second quadrant
                start = middle+1;
            }else {
                // middle in second quadrant and target in first quadrant
                end = middle -1;
            }

        }
        return false;
    }
}
