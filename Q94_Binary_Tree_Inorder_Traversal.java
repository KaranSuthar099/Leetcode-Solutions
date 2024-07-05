import java.util.ArrayList;
import java.util.List;

public class Q94_Binary_Tree_Inorder_Traversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        if (root == null)
            return list;

        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));

        return list;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
