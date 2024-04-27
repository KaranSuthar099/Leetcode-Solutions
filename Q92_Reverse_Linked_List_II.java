public class Q92_Reverse_Linked_List_II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) return head;

        ListNode leftNode = null;
        ListNode rightNode;

        int counter = 0;
        ListNode iterator = head;
        while (counter != right - 1) {
            if (counter == left - 2)
                leftNode = iterator;
            iterator = iterator.next;
            counter++;
        }

        rightNode = iterator.next;
        iterator.next = null;

        // now reversing the sublist

        ListNode prev;
        if (leftNode == null)
            prev = head;
        else
            prev = leftNode.next;
        ListNode current = prev.next;

        prev.next = null;
        if (rightNode != null) {
            prev.next = rightNode;
        }
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        if (leftNode != null)
            leftNode.next = prev;
        else
            head = prev;


        return head;

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
