public class Q235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode iterator = root;
        int min = Math.max(q.val, p.val);

        while (iterator != null) {
            if (iterator.val > p.val && iterator.val < q.val || iterator.val > q.val && iterator.val < p.val)
                return iterator;

            if (iterator.val == p.val || iterator.val == q.val)
                return iterator;

            if (min < iterator.val)
                iterator = iterator.left;
            else
                iterator = iterator.right;
        }

        return iterator;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
