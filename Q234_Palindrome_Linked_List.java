public class Q234_Palindrome_Linked_List {
    public static boolean isPalindrome(ListNode head) {
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
        // we have to check value by value until one of them
        // is finished (to handle the condition where there are odd number of elements)

        while (head != null && prev != null) {
            if (head.val != prev.val) return false;

            // iteration
            head = head.next;
            prev = prev.next;
        }

        return true;
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
