import java.util.ArrayList;
import java.util.List;

public class Q46_Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> retList = new ArrayList<>();
        per(nums, new ArrayList<>(), 0, retList);
        return retList;
    }

    public static void per(int[] nums, ArrayList<Integer> currentList, int index, List<List<Integer>> retList) {
        if (index == nums.length){
            ArrayList<Integer> addList = new ArrayList<>(currentList);
            retList.add(addList);
            return;
        }

        for (int i = 0; i<= currentList.size(); i++){
            currentList.add(i, nums[index]);
            per(nums, currentList, index + 1, retList);
            // backtrack
            currentList.remove(i);
        }

    }

}
