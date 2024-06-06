import java.util.ArrayList;
import java.util.List;

public class Q39_Combination_Sum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> retList = new ArrayList<>();
        combination(candidates, target, new ArrayList<>(), 0, retList);
        return retList;
    }

    public static void combination(int[] candidates, int target, List<Integer> currentList, int index,
                                   List<List<Integer>> retList) {
        if (target == 0) {
            retList.add(new ArrayList<>(currentList));
            return;
        }
        if (target < 0 || index == candidates.length) {
            return;
        }

        // Include the current candidate
        currentList.add(candidates[index]);
        combination(candidates, target - candidates[index], currentList, index, retList);

        // Exclude the current candidate
        currentList.removeLast();
        combination(candidates, target, currentList, index + 1, retList);
    }

}
