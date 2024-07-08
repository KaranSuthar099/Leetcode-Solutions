public class Q513_Find_Bottom_Left_Tree_Value {

    public int findBottomLeftValue(TreeNode root) {
        // leve {depth, value}
        int[] level = new int[2];
        findBottomLeftValue(root, level, 0);

        return level[1];
    }

    public void findBottomLeftValue(TreeNode root, int[] level, int currentLevel) {
        if (root == null)
            return;

        if (level[0] <= currentLevel) {
            level[0] = currentLevel;
            level[1] = root.val;
        }

        findBottomLeftValue(root.right, level, currentLevel + 1);
        findBottomLeftValue(root.left, level, currentLevel + 1);
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
