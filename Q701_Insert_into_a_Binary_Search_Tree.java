public class Q701_Insert_into_a_Binary_Search_Tree {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);

        TreeNode iterator = root;
        while (true) {
            if (val > iterator.val) {
                if (iterator.right == null) {
                    iterator.right = new TreeNode(val);
                    break;
                }
                iterator = iterator.right;
            } else {
                // val < iterator.val
                if (iterator.left == null) {
                    iterator.left = new TreeNode(val);
                    break;
                }
                iterator = iterator.left;
            }
        }

        return root;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

}
