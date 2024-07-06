import java.util.ArrayList;
import java.util.List;

public class Q113_Path_Sum_II {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> sumArray = new ArrayList<>();

        List<Integer> currentList = new ArrayList<>();
        pathSum(root, sumArray, currentList, targetSum);

        return sumArray;
    }

    public void pathSum(TreeNode root, List<List<Integer>> sumArray, List<Integer> currentList, int targetSum) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            targetSum -= root.val;
            if (targetSum == 0) {
                currentList.add(root.val);
                sumArray.add(new ArrayList<>(currentList));
                currentList.remove(currentList.size() - 1);
                return;
            }
        }

        targetSum -= root.val;
        currentList.add(root.val);

        pathSum(root.left, sumArray, currentList, targetSum);
        pathSum(root.right, sumArray, currentList, targetSum);

        currentList.remove(currentList.size() - 1);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
