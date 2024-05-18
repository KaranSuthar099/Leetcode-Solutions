import java.util.Arrays;

public class Q189_Rotate_Array {

    public static void main(String[] args) {
        int[] ary = {1, 2, 3, 4, 5, 6, 7};
        rotate(ary, 3);
        System.out.println(Arrays.toString(ary));
    }

    public static void reverseInRange(int[] nums, int left, int right) {
        while (left < right) {
            int container = nums[left];
            nums[left++] = nums[right];
            nums[right--] = container;
        }

    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        // reverse the array
        reverseInRange(nums, 0, nums.length - 1);

        // reverse the front part
        reverseInRange(nums, 0, k-1);
        reverseInRange(nums, k, nums.length - 1);


    }

}
