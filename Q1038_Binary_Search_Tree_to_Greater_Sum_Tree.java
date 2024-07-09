public class Q1038_Binary_Search_Tree_to_Greater_Sum_Tree {

    public TreeNode bstToGst(TreeNode root) {
        int[] sum = new int[1];
        bstToGst(root, sum);

        return root;
    }

    public void bstToGst(TreeNode root, int[] sum) {
        if (root == null)
            return;

        bstToGst(root.right, sum);
        root.val = root.val + sum[0];
        sum[0] = root.val;
        bstToGst(root.left, sum);

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
