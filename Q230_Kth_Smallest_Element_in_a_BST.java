import java.util.ArrayList;
import java.util.List;

public class Q230_Kth_Smallest_Element_in_a_BST {

    public int kthSmallest(TreeNode root, int k) {
        return inOrderTraversal(root, k, new int[] { 0 });

    }

    public int inOrderTraversal(TreeNode root, int k, int[] counter) {
        if (root == null)
            return -1;

        int left = inOrderTraversal(root.left, k, counter);

        if (left != -1)
            return left;

        counter[0]++;
        if (counter[0] == k)
            return root.val;

        int right = inOrderTraversal(root.right, k, counter);
        if (right != -1)
            return right;

        return -1;
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
