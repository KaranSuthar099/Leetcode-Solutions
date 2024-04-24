public class Q21_Merge_Two_Sorted_Lists {

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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int start = 0;
        ListNode head = null;
        ListNode currentNode = null;

        while (list1 != null || list2 != null) {
            ListNode greaterValue;
            if (list1 == null) {
                greaterValue = new ListNode(list2.val);
                list2 = list2.next;
            } else if (list2 == null) {
                greaterValue = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                if (list1.val < list2.val) {
                    greaterValue = new ListNode(list1.val);
                    list1 = list1.next;
                }
                else {
                    greaterValue = new ListNode(list2.val);
                    list2 = list2.next;
                }
            }
            if (start == 0) {
                head = greaterValue;
                currentNode = head;
                start++;
                continue;
            }
            currentNode.next = greaterValue;
            currentNode = currentNode.next;

        }
        return head;

    }

    public static void main(String[] args) {
        LinkedList List1 = new LinkedList();
//        List1.insert(1);
//        List1.insert(2);
//        List1.insert(4);

        LinkedList List2 = new LinkedList();
//        List2.insert(1);
//        List2.insert(3);
//        List2.insert(4);

        ListNode mergedList = mergeTwoLists(List1.head, List2.head);
        while (mergedList != null) {
            System.out.println(mergedList.val);
            mergedList = mergedList.next;
        }

    }
}
