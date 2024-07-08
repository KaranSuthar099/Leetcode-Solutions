public class Q623_Add_One_Row_to_Tree {

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (root == null)
            return null;

        if (depth == 1) {
            return new TreeNode(val, root, null);
        }
        if (depth - 1 == 1) {
            TreeNode leftNode = new TreeNode(val);
            leftNode.left = root.left;
            root.left = leftNode;

            TreeNode rightNode = new TreeNode(val);
            rightNode.right = root.right;
            root.right = rightNode;
            return root;
        }

        root.left = addOneRow(root.left, val, depth - 1);
        root.right = addOneRow(root.right, val, depth - 1);

        return root;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
