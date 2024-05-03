import java.util.Arrays;
import java.util.HashSet;

public class Q1_Two_Sum {

    public static int[] twoSum(int[] nums, int target) {
        HashSet<Integer> numberSet = new HashSet<>();
        for (int i : nums) {
            numberSet.add(i);
        }
        int[] indexArray = new int[2];
        for (int i : numberSet) {
            if (numberSet.contains(target - i)) {
                int index = 0;
                for (int j = 0; j < nums.length; j++){
                    if ( nums[j] == i || nums[j] == target-i ) {
                        indexArray[index++] = j;
                    }
                }

            }
        }

        return indexArray;
    }

    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(array, 9)));
    }

}
