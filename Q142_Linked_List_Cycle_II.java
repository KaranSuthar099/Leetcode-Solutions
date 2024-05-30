public class Q142_Linked_List_Cycle_II {

    public ListNode detectCycle(ListNode head) {
        // handeling the case when list is empty
        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        while (true) {
            slow = slow.next;

            if ( fast == null || fast.next == null)
                return null;
            fast = fast.next.next;
            if (slow == fast) break;

        }

        // if the cycle found
        // find the node where the cycle starts
        fast = head;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

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

    private static class LinkedList {
        ListNode head;

        // Constructor
        LinkedList() {
            head = null;
        }

        // Method to insert a new node at the end of the list
        public void insert(int val) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
            } else {
                ListNode current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
    }

}
