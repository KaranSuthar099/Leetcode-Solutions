public class Q148_Sort_List {


    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        // half the list and merger

        // finding the middle element
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is the middle element
        ListNode head1 = head;
        ListNode head2 = slow.next;
        // breaking the connection
        slow.next = null;

        // sort the individual head
        head1 = sortList(head1);
        head2 = sortList(head2);

        // now merge the lists

        if (head1.val > head2.val) {
            head = head2;
            head2 = head2.next;
        } else {
            head = head1;
            head1 = head1.next;
        }

        ListNode iterator = head;

        while (head1 != null || head2 != null) {
            if (head1 == null) {
                iterator.next = head2;
                break;
            } else if (head2 == null) {
                iterator.next = head1;
                break;
            } else {
                // both list exists
                if (head1.val < head2.val) {
                    iterator.next = head1;
                    head1 = head1.next;
                } else {
                    iterator.next = head2;
                    head2 = head2.next;
                }
            }

            iterator = iterator.next;
        }

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
