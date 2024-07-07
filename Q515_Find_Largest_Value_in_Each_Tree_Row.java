import java.util.ArrayList;
import java.util.List;

public class Q515_Find_Largest_Value_in_Each_Tree_Row {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        largestValues(root, list, 0);
        return list;
    }

    public void largestValues(TreeNode root, List<Integer> list, int currentLevel){
        if (root == null) return;

        // add the current value
        if (list.size() == currentLevel){
            list.add(root.val);
        } else {
            int get = list.get(currentLevel);
            if (get < root.val) list.set(currentLevel, root.val);
        }

        largestValues(root.left, list, currentLevel+1);
        largestValues(root.right, list, currentLevel+1);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
    
}
