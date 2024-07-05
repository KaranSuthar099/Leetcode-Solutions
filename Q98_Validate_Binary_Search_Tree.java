public class Q98_Validate_Binary_Search_Tree {
    public boolean isValidBST(TreeNode root) {
        // we have to use a range concept to check
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }

        // check if the current node is in range
        if (root.val <= min || root.val >= max) {
            return false;
        }

        return isValidBST(root.left, min, root.val) &&
                isValidBST(root.right, root.val, max);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
