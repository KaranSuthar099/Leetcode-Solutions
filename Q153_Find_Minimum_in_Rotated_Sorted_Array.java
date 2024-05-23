public class Q153_Find_Minimum_in_Rotated_Sorted_Array {

    public static void main(String[] args) {
        int[] numbs = {6, 7, 8, 9, 1, 2, 3, 4, 5};
        System.out.println(findMin(numbs));
    }


    public static int findMin(int[] nums) {
        if (nums[0] < nums[nums.length - 1]) return nums[0];

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int middle = start + (end - start) / 2;

            if (nums[middle] >= nums[0]) start = middle + 1;
            else end = middle;
        }
        return nums[start];
    }

}
