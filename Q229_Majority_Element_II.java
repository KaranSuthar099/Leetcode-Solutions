import java.util.ArrayList;
import java.util.List;

public class Q229_Majority_Element_II {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> retArray = new ArrayList<>(2);
        if (nums.length == 1) {
            retArray.add(nums[0]);
            return retArray;
        }

        int count1 = 0;
        int element1 = -10909090;
        int count2 = 0;
        int element2 = -1090909;
        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0 && nums[i] != element2) {
                element1 = nums[i];
                count1++;
            } else if (count2 == 0 && nums[i] != element1) {
                element2 = nums[i];
                count2++;
            } else if (nums[i] == element1) count1++;
            else if (nums[i] == element2) count2++;
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int i : nums) {
            if (i == element1) count1++;
            if (i == element2) count2++;
        }

        int threshold = nums.length / 3;
        if (count1 > threshold)
            retArray.add(element1);
        if (count2 > threshold)
            retArray.add(element2);

        return retArray;

    }
}
