public class Q328_Odd_Even_Linked_List {


    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode oddHead = null;
        ListNode evenHead = null;

        ListNode iterator = head;
        ListNode odditerator = oddHead;
        ListNode eveniterator = evenHead;
        int index = 1;

        while (iterator != null) {
            ListNode next = iterator.next;

            // break the link
            iterator.next = null;

            // adding logic
            if (index % 2 == 0) {
                // iterator contains and even value

                // if the head is not assigned then assign it
                // the iterator will also be not assigned
                if (evenHead == null) {
                    // assign the
                    evenHead = iterator;
                    eveniterator = evenHead;
                } else {
                    // head is assigned and the iterator is also assigned
                    eveniterator.next = iterator;
                    eveniterator = eveniterator.next;
                }
            } else {
                // iterator contains an odd value
                if (oddHead == null) {
                    oddHead = iterator;
                    odditerator = oddHead;
                } else {
                    odditerator.next = iterator;
                    odditerator = odditerator.next;
                }
            }

            // next iteration
            iterator = next;
            index++;
        }
        odditerator.next = evenHead;
        return oddHead;

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
