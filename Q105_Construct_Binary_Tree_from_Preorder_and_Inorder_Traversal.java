public class Q105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int startp, int endp, int starti, int endi) {
        if (startp > endp || starti > endi)
            return null;

        TreeNode root = new TreeNode(preorder[startp]);

        // Find the index of the root in inorder array
        int index = 0;
        for (int i = starti; i <= endi; i++) {
            if (inorder[i] == preorder[startp]) {
                index = i;
                break;
            }
        }

        int leftTreeSize = index - starti;

        // Build the left subtree
        root.left = buildTree(preorder, inorder, startp + 1, startp + leftTreeSize, starti, index - 1);

        // Build the right subtree
        root.right = buildTree(preorder, inorder, startp + leftTreeSize + 1, endp, index + 1, endi);

        return root;
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
