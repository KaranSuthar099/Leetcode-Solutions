public class Q33_Search_in_Rotated_Sorted_Array {
    public static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length -1;

        while (start < end ){
            int middle = start + (end - start)/2;

            if (nums[middle] > nums[start])
                start = middle;
            else end = middle;
        }
        return start;
    }

    public static int binarySearch(int[] nums, int target , int start , int end){
        while (start <= end){
            int middle = start + (end - start)/2;

            if (nums[middle] > target)
                end = middle -1;
            else if (nums[middle] < target)
                start = middle +1;
            else return middle;
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        if (nums[0] < nums[nums.length-1])
            return binarySearch(nums, target, 0, nums.length-1);

        int peak = findPivot(nums);
        int retIndex = binarySearch(nums, target, 0, peak);
        if (retIndex == -1)
            retIndex = binarySearch(nums, target, peak +1, nums.length -1);

        return retIndex;
    }

}
