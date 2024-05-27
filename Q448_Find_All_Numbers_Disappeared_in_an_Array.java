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
        // using boolean array
        boolean[] mapArray = new boolean[nums.length];
        for (int i : nums){
            mapArray[i-1] = true;
        }
        ArrayList<Integer> retArray = new ArrayList<>();
        for (int i = 0; i< mapArray.length; i++){
            if (!mapArray[i]) retArray.add(i+1);
        }

        return retArray;
    }


}
