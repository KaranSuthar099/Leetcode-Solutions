public class Q147_Insertion_Sort_List {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        //    -1, 5, 3, 4, 0
        list.insert(-1);
        list.insert(5);
        list.insert(3);
        list.insert(4);
        list.insert(0);

        ListNode iterator = insertionSortList(list.head);
        while (iterator != null) {
            System.out.print(iterator.val + ", ");
            iterator = iterator.next;
        }

    }

    public static ListNode insertionSortList(ListNode head) {
        // loop than picks up the elements

        while (true) {
            ListNode iterator = head;
            boolean isListSorted = true;
            while (iterator.next != null){
                if (iterator.next.val < iterator.val){
                    isListSorted = false;
                    break;
                }
                iterator = iterator.next;
            }

            if (isListSorted) break;
            // make a copy of element
            ListNode element = iterator.next;

            // delete the node from the list
            iterator.next = iterator.next.next;
            if (iterator == head) {
                head = iterator;
            }

            // find the correct place for the element
            ListNode first = head;
            ListNode last = head;
            while (last != null && last.val < element.val) {
                first = last;
                last = last.next;
            }

            if (first == last) {
                // head is greater than the current element
                element.next = head;
                head = element;
            } else {
                element.next = last;
                first.next = element;
            }

        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return Integer.toString(val);
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
