public class Q99_Recover_Binary_Search_Tree {

    public void recoverTree(TreeNode root) {
        TreeNode[] list = new TreeNode[2];
        recoverTree(root, list);

        int container = list[1].val;
        list[1].val = list[0].val;
        list[0].val = container;
    }

    public void recoverTree(TreeNode root, TreeNode[] listNodes){
        if (root == null) return;

        recoverTree(root.left, listNodes);
        
        if (listNodes[0] == null || listNodes[0].val < root.val) {
            if ( listNodes[1] == null) listNodes[0] = root;

        } else if ( listNodes[0].val > root.val){
            listNodes[1] = root;
        }
        
        recoverTree(root.right, listNodes);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
