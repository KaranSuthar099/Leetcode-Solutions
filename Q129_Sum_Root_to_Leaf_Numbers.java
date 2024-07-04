import java.util.ArrayList;
import java.util.List;

public class Q129_Sum_Root_to_Leaf_Numbers {

    public int sumNumbers(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        sumNumbers(root, 0, list);

        int sum = 0;
        for (int i : list) {
            sum += i;
        }

        return sum;
    }

    public void sumNumbers(TreeNode root, int currentSum, List<Integer> list) {
        if (root == null)
            return;

        currentSum = (currentSum * 10) + root.val;
        if (root.left == null && root.right == null) {
            list.add(currentSum);
            return;
        }

        sumNumbers(root.left, currentSum, list);
        sumNumbers(root.right, currentSum, list);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
