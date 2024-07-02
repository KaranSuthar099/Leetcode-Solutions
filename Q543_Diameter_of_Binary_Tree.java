public class Q543_Diameter_of_Binary_Tree {

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        int[] d = new int[1];
        diameter(root, d);
        return d[0];
    }

    public int diameter(TreeNode root, int[] d) {
        if (root == null)
            return 0;

        int left = diameter(root.left, d);
        int right = diameter(root.right, d);

        d[0] = Math.max(d[0], left + right);
        return 1 + Math.max(left, right);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

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
