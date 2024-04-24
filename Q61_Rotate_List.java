public class Q61_Rotate_List {
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


    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k==0)
            return head;

        // to counter numbers which are too large
        int kcounter = 0;
        if (k > 500) {
            while (k % 3 != 0) {
                k--;
                kcounter++;
            }
        } else {
            kcounter = k;
        }

        ListNode tail;
        ListNode prevtail;


        for (int i = 0; i < kcounter; i++) {
            tail = head;
            prevtail = head;
            while (tail.next != null) {
                if (prevtail.next.next != null)
                    prevtail = prevtail.next;

                tail = tail.next;
            }
            prevtail.next = null;
            tail.next = head;

            head = tail;
        }
        return head;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create an instance of the LinkedList class
        list.insert(1);
        list.insert(2);

        System.out.println(rotateRight(list.head, 3));

        // Displaying the elements of the linked list
        ListNode current = list.head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
