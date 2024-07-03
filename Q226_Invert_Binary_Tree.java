public class Q226_Invert_Binary_Tree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        invertTree(root.left);
        invertTree(root.right);

        TreeNode right = root.right;
        root.right = root.left;
        root.left = right;

        return root;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
