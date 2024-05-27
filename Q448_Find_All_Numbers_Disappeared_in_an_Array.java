import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q448_Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // using hashSet

        HashSet<Integer> set = new HashSet<>();
        for (int i: nums){
            set.add(i);
        }

        ArrayList<Integer> retList = new ArrayList<>();
        for (int i = 1; i<=nums.length; i++){
            if (!set.contains(i)) retList.add(i);
        }

        return retList;
    }


}
