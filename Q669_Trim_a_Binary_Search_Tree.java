public class Q669_Trim_a_Binary_Search_Tree {

    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null)
            return null;

        TreeNode left = trimBST(root.left, low, high);
        TreeNode right = trimBST(root.right, low, high);

        if (root.val < low) {
            // delete the current Node
            // then we can also not take the values to the left of root
            // as they will also be small then root
            // hence we can only return the values greater than
            // also we will always get valid values in left and right so we can use them
            return right;

        } else if (root.val > high) {
            return left;
        }

        // else we do not over flow the values then we can just return
        root.left = left;
        root.right = right;

        return root;

    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
