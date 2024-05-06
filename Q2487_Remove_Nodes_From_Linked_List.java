public class Q2487_Remove_Nodes_From_Linked_List {

    public ListNode removeNodes(ListNode head) {
        // reversing the list
        ListNode current = head.next;
        ListNode prev = head;
        prev.next = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;


        current = head;
        int prevGreatest = current.val;
        while (current.next != null) {
            if (current.next.val < prevGreatest)
                current.next = current.next.next;
            else {
                prevGreatest = current.next.val;
                current = current.next;
            }
        }

        // reversing the list again
        current = head.next;
        prev = head;
        prev.next = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public static class ListNode {
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
