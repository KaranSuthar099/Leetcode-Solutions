import java.util.Arrays;

public class Q34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {5};
        System.out.println(Arrays.toString(searchRange(nums, 5)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        boolean isNotFound = true;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] > target)
                right = middle - 1;
            else if (nums[middle] < target)
                left = middle + 1;
            else {
                isNotFound = false;
                break;
            }
        }
        if (isNotFound) {
            return new int[]{-1, -1};
        }
        // that means element is found at the middle index
        left = right = left + (right - left) / 2;

        while (left-1 >= 0){
            if (nums[left-1] == target) left--;
            else break;
        }
        while (right+1 < nums.length){
            if (nums[right+1] == target) right++;
            else break;
        }

        return new int[]{left, right};
    }
}
