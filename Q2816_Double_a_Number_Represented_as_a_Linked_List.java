public class Q2816_Double_a_Number_Represented_as_a_Linked_List {
    public ListNode doubleIt(ListNode head) {
        // reading the number while reversing it
        ListNode current = head.next;
        ListNode prev = head;
        ListNode next;
        prev.next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

        // now reversing while multiplying by 2
        current = head.next;
        prev = head;
        prev.next = null;

        // lets say digit is 5
        // if doubled it will become 10
        // we have ot store 0 in node and add 1 to carry
        // and next time doubling the digtit lets say
        int carry = 0 ;
        prev.val = prev.val * 2 + carry;
        carry = prev.val / 10 ;
        prev.val = prev.val % 10;

        while ( current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next ;

            // doubling the digit
            prev.val = prev.val * 2 + carry;
            carry = prev.val / 10 ;
            prev.val = prev.val % 10;
        }
        head = prev;
        // there can be a trailing carry;
        if (carry != 0){
            ListNode trail = new ListNode(carry);
            trail.next = head;
            head = trail;
        }
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
