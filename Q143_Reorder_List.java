public class Q143_Reorder_List {

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

    public void reorderList(ListNode head) {
        if ( head.next == null || head.next.next == null) return;


        // first we have to break the list in two half
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // breaking the list
        ListNode headtwo = slow.next;
        slow.next = null;

        //reversing the second part
        ListNode prev = headtwo;
        ListNode current = headtwo.next;
        prev.next = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        headtwo = prev;

        // now reordering the list
        ListNode iterator = head;
        ListNode endNode = headtwo;
        while (iterator != null  && headtwo != null) {
            headtwo = endNode.next;
            endNode.next = iterator.next;
            iterator.next = endNode;
            iterator = iterator.next.next;
            endNode = headtwo;
        }
    }


}
