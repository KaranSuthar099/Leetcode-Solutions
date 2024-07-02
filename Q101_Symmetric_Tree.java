public class Q101_Symmetric_Tree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            if (root1 == null && root2 == null)
                return true;
            return false;
        }

        if (root1.val == root2.val)
            return isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
        return false;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
