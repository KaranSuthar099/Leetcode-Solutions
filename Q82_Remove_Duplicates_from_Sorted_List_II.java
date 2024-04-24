public class Q82_Remove_Duplicates_from_Sorted_List_II {
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

    public static int isRepeated(ListNode head) {
        int counter = 0;
        int value = head.val;
        ListNode currentNode = head;
        while (currentNode.val == value) {
            counter++;
            if (currentNode.next == null)
                return counter;
            currentNode = currentNode.next;
        }
        return counter;
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode check = head;
        ListNode currentNode = null;
        int isRep = 0;
        while (true) {
            isRep = isRepeated(check);

            if (isRep > 1) {
                for (int i = 0; i < isRep; i++)
                    check = check.next;
            }
            if (check == null) {
                head = null;
                return head;
            }

            if (isRep == 1) {
                if (check.next == null) {
                    head.next = null;
                    head.val = check.val;
                    return head;
                }
                break;
            }
//            check = check.next;
        }
        head.val = check.val;
        head.next = check.next;
        currentNode = head;
//        currentNode.next = null;
        check = currentNode.next;
        while (currentNode.next != null) {

            isRep = isRepeated(check);
            if (isRep == -1) {
                currentNode.next = null;
                return head;
            }
            if (isRep > 1) {
                for (int i = 0 ; i<isRep; i++)
                    check = check.next;
            }
            if (isRep == 1) {
                currentNode.next = check;
                currentNode = currentNode.next;
                check = check.next;
            }
            if (check == null)
                break;
        }
        currentNode.next = null;

        return head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create an instance of the LinkedList class
        list.insert(1);
        list.insert(1);
        list.insert(2);

        System.out.println(deleteDuplicates(list.head));

        // Displaying the elements of the linked list
        ListNode current = list.head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
