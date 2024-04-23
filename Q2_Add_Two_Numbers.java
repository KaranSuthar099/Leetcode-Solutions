public class Q2_Add_Two_Numbers {
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

    public static class LinkedList {
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int number = l1.val + l2.val;
        ListNode head = new ListNode(number%10);
        ListNode sum = head;
        number /= 10;
        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null || l2 != null) {
            if (l1 == null)  number += l2.val;
            else if (l2 == null)  number += l1.val;
            else  number += l1.val + l2.val;

            sum.next = new ListNode(number%10);
            number /= 10;
            sum = sum.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        while (number != 0) {
            sum.next = new ListNode(number % 10);
            number /= 10;
            sum = sum.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insert(2);
        l1.insert(4);
        l1.insert(9);

        LinkedList l2 = new LinkedList();
        l2.insert(5);
        l2.insert(6);
        l2.insert(4);
        l2.insert(9);

        ListNode currentNode = addTwoNumbers(l1.head, l2.head);
        while (currentNode != null) {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;

        }
    }
}
