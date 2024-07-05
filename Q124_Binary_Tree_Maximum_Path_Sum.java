public class Q124_Binary_Tree_Maximum_Path_Sum {

    public int maxPathSum(TreeNode root) {
        int[] maxPath = new int[1];
        maxPath[0] = -1001;
        maxPath[0] = Math.max(maxPathSum(root, maxPath), maxPath[0]);
        
        return maxPath[0];
    }

    public int maxPathSum(TreeNode root, int[] maxPath) {
        if (root == null)
            return 0;

        int left = maxPathSum(root.left, maxPath);
        int right = maxPathSum(root.right, maxPath);

        maxPath[0] = Math.max(root.val + left + right, maxPath[0]);

        if (left <= 0 && right <= 0) {
            maxPath[0] = Math.max(root.val, maxPath[0]);
            return root.val;
        }

        maxPath[0] = Math.max(root.val + Math.max(left, right), maxPath[0]);
        return root.val + Math.max(left, right);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
