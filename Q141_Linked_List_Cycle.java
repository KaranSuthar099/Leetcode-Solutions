public class Q141_Linked_List_Cycle {

    private static class ListNode {
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


    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null){
            slow = slow.next;
            if ( fast.next == null) return false;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;

    }
}
