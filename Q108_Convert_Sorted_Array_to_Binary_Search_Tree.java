public class Q108_Convert_Sorted_Array_to_Binary_Search_Tree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums, 0, nums.length - 1);
    }

    public TreeNode bst(int[] nums, int start, int end) {
        if (start > end)
            return null;

        int middle = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[middle]);

        root.left = bst(nums, start, middle - 1);
        root.right = bst(nums, middle + 1, end);

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
