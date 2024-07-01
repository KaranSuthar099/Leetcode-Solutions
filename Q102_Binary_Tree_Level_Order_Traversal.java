import java.util.ArrayList;
import java.util.List;

public class Q102_Binary_Tree_Level_Order_Traversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lvl = new ArrayList<>();
        lvlOrder(root, lvl, 0);
        return lvl;
    }

    public void lvlOrder(TreeNode root, List<List<Integer>> lvl, int level) {
        if (root == null)
            return;

        // add the current element in the linked List
        if (lvl.size() == level) {
            // add a new element
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.val);
            lvl.add(list);
        } else {
            lvl.get(level).addFirst(root.val);
        }

        // iterate next
        lvlOrder(root.right, lvl, level + 1);
        lvlOrder(root.left, lvl, level + 1);
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