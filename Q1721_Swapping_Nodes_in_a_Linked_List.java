public class Q1721_Swapping_Nodes_in_a_Linked_List {
    public ListNode swapNodes(ListNode head, int k) {
        // swapping the values

        int index = 1;
        ListNode iterator = head;
        ListNode left = null;
        ListNode right = head;

        while (iterator != null) {
            if (index == k)
                left = iterator;

            if (index > k) {
                right = right.next;
            }
            index++;
            iterator = iterator.next;
        }

        // swap values

        int container = left.val;
        left.val = right.val;
        right.val = container;

        return head;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}