public class Q538_Convert_BST_to_Greater_Tree {

    public TreeNode convertBST(TreeNode root) {
        int[] sum = new int[1];
        convertBST(root, sum);

        return root;
    }

    public void convertBST(TreeNode root, int[] sum){
        if (root == null) return;

        convertBST(root.right, sum);
        root.val = root.val + sum[0];
        sum[0] = root.val;
        convertBST(root.left, sum);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
    
}
