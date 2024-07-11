public class Q106_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder, int starti, int endi, int startp, int endp) {
        if (starti > endi || startp > endp)
            return null;

        int rootElement = postorder[endp];
        TreeNode root = new TreeNode(rootElement);

        int indexi = starti;
        while (indexi <= endi && inorder[indexi] != rootElement) {
            indexi++;
        }

        int leftTreeSize = indexi - starti;

        root.left = buildTree(inorder, postorder, starti, indexi - 1, startp, startp + leftTreeSize - 1);
        root.right = buildTree(inorder, postorder, indexi + 1, endi, startp + leftTreeSize, endp - 1);

        return root;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

}
