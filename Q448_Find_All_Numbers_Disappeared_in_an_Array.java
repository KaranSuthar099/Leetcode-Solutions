import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q448_Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // cyclic sort
        int i = 0;
        while (i < nums.length) {
            // if the element is at correct index of we are having cycle
            // continue to the next iteration
            if (nums[i] - 1 == i || nums[i] == nums[nums[i] - 1]) i++;
            else {
                // swap the elements
                int container = nums[i];
                nums[i] = nums[container - 1];
                nums[container - 1] = container;
            }
        }

        // now preparing the return list
        ArrayList<Integer> retList = new ArrayList<>();
        for (i = 0; i < nums.length; i++) {
            if (nums[i] -1 != i) retList.add(i+1);
        }

        return retList;
    }


}
