import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Q297_Serialize_and_Deserialize_Binary_Tree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        // make a string of level Order including nulls
        if (root == null)
            return "";

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        StringBuilder retString = new StringBuilder();
        while (!queue.isEmpty()) {
            TreeNode peek = queue.remove();

            if (peek == null) {
                retString.append("-9999,");
                continue;
            }

            retString.append(peek.val + ",");

            queue.add(peek.left);
            queue.add(peek.right);
        }

        // deleting the last ","
        retString.deleteCharAt(retString.length() - 1);

        return retString.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals(""))
            return null;

        String[] split = data.split(",");
        int iterator = 0;

        TreeNode root = new TreeNode(Integer.parseInt(split[iterator++]));

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode peek = queue.remove();

            int left = Integer.parseInt(split[iterator++]);
            if (left != -9999) {
                peek.left = new TreeNode(left);
                queue.add(peek.left);
            }

            int right = Integer.parseInt(split[iterator++]);
            if (right != -9999) {
                peek.right = new TreeNode(right);
                queue.add(peek.right);
            }
        }
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
