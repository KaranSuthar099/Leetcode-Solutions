public class Q24_Swap_Nodes_in_Pairs {
    //  Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

    }

    static class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null)
                return head;
            ListNode currentNode = head;
            ListNode prevNode;
            ListNode nextNode;

            head = currentNode.next;
            currentNode.next = head.next;
            head.next = currentNode;

            prevNode = currentNode;
            currentNode = currentNode.next;
            if (currentNode == null)
                return head;
            nextNode = currentNode.next;

            while (true) {
                if (currentNode.next == null)
                    break;
                prevNode.next = nextNode;
                currentNode.next = nextNode.next;
                nextNode.next = currentNode;

                if (currentNode.next == null)
                    break;
                prevNode = currentNode;
                currentNode = currentNode.next;
                nextNode = currentNode.next;
            }
            return head;
        }
    }
}
