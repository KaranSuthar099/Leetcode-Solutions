public class Q540_Single_Element_in_a_Sorted_Array {

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int middle = start + (end - start) / 2;
            boolean isEven = middle %2 == 0;

            if (middle > 0 && nums[middle] == nums[middle - 1]) {
                if (isEven) end = middle - 1;
                else start = middle + 1;

            } else if (middle < nums.length - 1 && nums[middle] == nums[middle + 1]) {
                if (isEven) start = middle + 1;
                else end = middle - 1;
            } else return nums[middle];
        }
        return nums[start];

    }

}
