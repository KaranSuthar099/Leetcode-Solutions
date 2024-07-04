public class Q112_Path_Sum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSum(root, targetSum, 0);

    }

    public boolean hasPathSum(TreeNode root, int targetSum, int currentSum) {
        if (root == null)
            return false;

        currentSum += root.val;
        if (currentSum == targetSum) {
            if (root.left == null && root.right == null)
                return true;
        }
        return hasPathSum(root.left, targetSum, currentSum) || hasPathSum(root.right, targetSum, currentSum);

    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
