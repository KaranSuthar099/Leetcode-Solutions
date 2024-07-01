import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Q637_Average_of_Levels_in_Binary_Tree {

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

    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> avgList = new ArrayList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            double sum = 0;
            int count = 0;

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode peek = queue.remove();
                sum += peek.val;
                count++;

                if (peek.left != null) queue.add(peek.left);
                if (peek.right != null) queue.add(peek.right);
            }

            avgList.add((Double) (sum / count));
        }

        return avgList;
    }
}