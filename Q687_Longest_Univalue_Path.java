public class Q687_Longest_Univalue_Path {

    public int longestUnivaluePath(TreeNode root) {
        int[] longest = new int[1];
        longestUnivaluePath(root, 10000, longest);
        return longest[0];

    }

    public int longestUnivaluePath(TreeNode root, int prevValue, int[] longest) {
        // what we have to do -
        // trace the path left and right till the value is same
        // return the steps till the value is same
        // update the longest

        if (root == null)
            return 0;

        int left = longestUnivaluePath(root.left, root.val, longest);
        int right = longestUnivaluePath(root.right, root.val, longest);

        if (left + right > longest[0])
            longest[0] = left + right;

        if (prevValue == root.val) {
            return 1 + Math.max(left, right);
        }

        return 0;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
