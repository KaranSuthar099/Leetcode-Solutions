import java.util.Arrays;

public class Q238_Product_of_Array_Except_Self {

    public static void main(String[] args) {
        int[] nums = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] retArray = new int[nums.length];
        retArray[0] = 1;

        // setting the prefixes
        int multiplier = nums[0];
        for (int i = 1; i < nums.length; i++) {
            retArray[i] = multiplier;
            multiplier *= nums[i];
        }

        // setting the post fixes
        multiplier = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            retArray[i] *= multiplier;
            multiplier *= nums[i];
        }


        return retArray;
    }

}
