public class Q34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static int[] searchRange(int[] nums, int target) {
        int[] retArray = {-1, -1};

        int start = 0;
        int end = nums.length - 1;

        retArray[0] = findEdge(nums, target, true);
        retArray[1] = findEdge(nums, target, false);
        return retArray;
    }

    public static int findEdge(int[] nums, int target, boolean findFirstOccurence) {
        int start = 0;
        int end = nums.length - 1;

        int index = -1;
        // finding the position
        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (nums[middle] > target) {
                end = middle - 1;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                if (findFirstOccurence)
                    end = middle - 1;
                else
                    start = middle + 1;
                index = middle;
            }
        }
        return index;
    }
}
