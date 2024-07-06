import java.util.LinkedList;
import java.util.Queue;

public class Q173_Binary_Search_Tree_Iterator {

    class BSTIterator {
        Queue<Integer> queue = new LinkedList<>();
        int pointer = 0;

        public BSTIterator(TreeNode root) {
            inorderTraversal(root);
        }

        public void inorderTraversal(TreeNode root) {
            if (root == null)
                return;

            inorderTraversal(root.left);
            queue.add(root.val);
            inorderTraversal(root.right);
        }

        public int next() {
            return queue.remove();
        }

        public boolean hasNext() {
            return !queue.isEmpty();
        }
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
