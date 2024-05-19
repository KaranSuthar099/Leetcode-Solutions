public class Q153_Find_Minimum_in_Rotated_Sorted_Array {

    public static void main(String[] args) {
        int[] numbs = { 6, 7, 8, 9, 1, 2, 3, 4, 5};
        System.out.println(findMin(numbs));
    }


    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        if (nums[left] < nums[right])
            return nums[0];

        while (left != right && right -1 != left){
            int middle = left + (right - left)/2;
            if (nums[right] > nums[middle])
                right = middle;
            else
                left = middle;
        }

        return Math.min(nums[left], nums[right]);
    }

}
