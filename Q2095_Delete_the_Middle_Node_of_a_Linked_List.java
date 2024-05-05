public class Q2095_Delete_the_Middle_Node_of_a_Linked_List {
    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        if (head.next.next == null){
            head.next = null;
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (true) {
            if (fast == null || fast.next == null) {
                slow.val = slow.next.val;
                slow.next = slow.next.next;
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return head;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
//        list.insert(5);
        deleteMiddle(list.head);

        ListNode listhead = list.head;
        while (listhead != null) {
            System.out.println(listhead.val);
            listhead = listhead.next;
        }
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

        // Main method

    }

}
