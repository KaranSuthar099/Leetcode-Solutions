import java.util.ArrayList;
import java.util.List;

public class Q442_Find_All_Duplicates_in_an_Array {

    public static void main(String[] args) {
        int[] nums = {10, 2, 5, 10, 9, 1, 1, 4, 3, 7};
        System.out.println(findDuplicates(nums));
        // [7,10]
    }

    public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> retArray = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] > 0) nums[index] *= -1;
            else retArray.add(index+1);

        }
        return retArray;
    }
}
