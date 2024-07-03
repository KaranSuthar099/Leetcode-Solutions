public class Q114_Flatten_Binary_Tree_to_Linked_List {

    public void flatten(TreeNode root) {
        if (root == null)
            return;

        TreeNode[] iterator = new TreeNode[1];
        TreeNode dummy = new TreeNode(0);
        iterator[0] = dummy;

        preOrderTraversal(root, iterator);

        root.left = null;
        root.right = dummy.right.right;
    }

    public void preOrderTraversal(TreeNode root, TreeNode[] iterator) {
        if (root == null)
            return;

        iterator[0].right = new TreeNode(root.val);
        iterator[0].left = null;
        iterator[0] = iterator[0].right;

        preOrderTraversal(root.left, iterator);
        preOrderTraversal(root.right, iterator);

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
