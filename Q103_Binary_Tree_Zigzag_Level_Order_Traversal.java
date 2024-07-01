import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q103_Binary_Tree_Zigzag_Level_Order_Traversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        queue.add(root);
        boolean zigzag = false;
        while (!queue.isEmpty()) {
            int size = queue.size();

            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode peek = queue.remove();

                if (zigzag) {
                    currentLevel.addFirst(peek.val);
                } else
                    currentLevel.add(peek.val);

                if (peek.left != null)
                    queue.add(peek.left);
                if (peek.right != null)
                    queue.add(peek.right);
            }
            result.add(currentLevel);

            zigzag = !zigzag;
        }
        return result;
    }

    public class TreeNode {
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
