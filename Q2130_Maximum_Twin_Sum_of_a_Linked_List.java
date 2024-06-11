public class Q2130_Maximum_Twin_Sum_of_a_Linked_List {

    public int pairSum(ListNode head) {
        // half the list
        ListNode middle = head;
        ListNode last = head;
        while (last.next != null && last.next.next != null) {
            middle = middle.next;
            last = last.next.next;
        }
        // now breaking the list

        ListNode head2 = middle.next;
        middle.next = null;

        // now reversing any one part
        ListNode prev = null;
        ListNode current = head2;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // now prev is new head and head2 is other head
        int maxSum = 0;
        while (head != null && prev != null) {
            int currentSum = head.val + prev.val;
            if (currentSum > maxSum) maxSum = currentSum;

            head = head.next;
            prev = prev.next;
        }
        return maxSum;
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