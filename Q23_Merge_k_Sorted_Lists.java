public class Q23_Merge_k_Sorted_Lists {

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


    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;


        int start = 0;
        int size = lists.length;
        int min = 999;
        int index = -1;

        ListNode head = null;
        ListNode currentNode = null;
        ListNode smallestValue = null;

        boolean itterateNext = true;
        while (true) {
            itterateNext = false;
            for (int i = 0; i < size; i++) {
                if (lists[i] == null)
                    continue;
                itterateNext = true;
                if (lists[i].val <= min) {
                    min = lists[i].val;
                    index = i;
                }
            }
            if (!itterateNext)
                break;

            lists[index] = lists[index].next;
            smallestValue = new ListNode(min);

            min = 999;
            index = -1;

            if (start == 0) {
                head = smallestValue;
                currentNode = head;
                start++;
                continue;
            }
            currentNode.next = smallestValue;
            currentNode = currentNode.next;

        }
        return head;

    }

    public static void main(String[] args) {
        LinkedList List1 = new LinkedList();
        List1.insert(0);
        List1.insert(2);
        List1.insert(5);
//
//        LinkedList List2 = new LinkedList();
//        List2.insert(1);
//        List2.insert(3);
//        List2.insert(4);
//
//        LinkedList List3 = new LinkedList();
//        List3.insert(2);
//        List3.insert(6);
//        List3.insert(4);

        ListNode[] arrListNode = {List1.head}; //, List2.head, List3.head
//        ListNode[] arrListNode = {};
        ListNode mergedList = mergeKLists(arrListNode);
        while (mergedList != null) {
            System.out.println(mergedList.val);
            mergedList = mergedList.next;
        }
    }


}
