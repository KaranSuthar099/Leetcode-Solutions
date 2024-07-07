public class Q109_Convert_Sorted_List_to_Binary_Search_Tree {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prevSlow = null;
        while (fast != null && fast.next != null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode root = new TreeNode(slow.val);

        root.right = sortedListToBST(slow.next);
        if (slow != head) {
            prevSlow.next = null;
            root.left = sortedListToBST(head);
        }

        return root;
    }

    private static class ListNode {
        int val;
        ListNode next;

    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

}