import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Q1_Two_Sum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberSet = new HashMap<>();
        for (int i = 0; i < nums.length; i++) numberSet.put(nums[i], i);

        for (int i = 0; i < nums.length; i++) {
            // if we select element at i index then target - i must be present in the array
            int remainingSum = target - nums[i];

            // if remaining part is present in the array
            if (numberSet.containsKey(remainingSum)) {
                // if it is not the duplicate of the same then return
                int index = numberSet.get(remainingSum);
                if (index != i) return new int[]{i, index};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(array, 9)));
    }

}
