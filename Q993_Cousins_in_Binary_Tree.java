public class Q993_Cousins_in_Binary_Tree {

    public boolean isCousins(TreeNode root, int x, int y) {
        // first check if the are not siblings
        // then check if they are at same level

        int[] level = new int[2];
        if (!isSiblingAndLevel(root, x, y, level, 0)) {
            if (level[0] == level[1])
                return true;
        }
        return false;
    }

    public boolean isSiblingAndLevel(TreeNode root, int x, int y, int[] level, int currentLevel) {
        if (root == null)
            return false;
        // if both the nodes are present

        if (root.val == x) {
            level[0] = currentLevel;
        } else if (root.val == y) {
            level[1] = currentLevel;
        }

        if (root.left != null && root.right != null) {
            // check for siblings
            if (root.left.val == x && root.right.val == y || root.left.val == y && root.right.val == x)
                return true;
        }

        return isSiblingAndLevel(root.left, x, y, level, currentLevel + 1) ||
                isSiblingAndLevel(root.right, x, y, level, currentLevel + 1);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

    }

}
