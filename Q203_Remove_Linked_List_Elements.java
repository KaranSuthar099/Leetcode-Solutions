public class Q203_Remove_Linked_List_Elements {

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

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;

        while (head != null && head.val == val) {
            head = head.next;
            if (head == null) {
                return null;
            }
        }

        ListNode current = head;
        while (current.next != null && current != null){
            if (current.next.val == val){
                current.next = current.next.next;
                continue;
            }
            current = current.next;

        }
        return head;

    }

    public static void main(String[] args) {
        LinkedList newList = new LinkedList();
        newList.insert(7);
        newList.insert(7);
        newList.insert(7);
//        newList.insert(4);
//        newList.insert(5);
//        newList.insert(6);



        ListNode currentNode = removeElements(newList.head, 7);
        while (currentNode != null){
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
    }
}