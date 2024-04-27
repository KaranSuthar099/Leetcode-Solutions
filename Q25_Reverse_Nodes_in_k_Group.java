public class Q25_Reverse_Nodes_in_k_Group {

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

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null || head.next == null) return head;

        ListNode iterator = head;
        boolean isHeadPlaced = true;
        ListNode end = null;
        ListNode start = null;

        while (iterator != null && iterator.next != null) {

            ListNode checkIterator = iterator;
            boolean nextGroup = true;

            //checking if next node group exists or not
            for (int i = 0; i < k - 1; i++) {
                if (checkIterator == null) {
                    nextGroup = false;
                    break;
                }
                checkIterator = checkIterator.next;
            }
            if (checkIterator == null) {
                start.next = iterator;
                break;
            }
            if (nextGroup) {
                end = checkIterator;
                if (!isHeadPlaced) {
                    start.next = end;
                }
                start = iterator;
                for (int i = 0; i < k - 1; i++) {
                    iterator = iterator.next;
                }
                iterator = iterator.next;
                // implement the logic of reversing the linked list
                ListNode prev = start;
                ListNode current = start.next;
                if (isHeadPlaced) {
                    head = end;
                    isHeadPlaced = false;
                }
                end.next = null;
                start.next = null;
                while (current != null) {
                    ListNode next = current.next;
                    current.next = prev;
                    prev = current;
                    current = next;
                }

            }

        }
        if (iterator != null)
            start.next = iterator;
        return head;
    }

}
