public class Q83_Remove_Duplicates_from_Sorted_List {
    private class ListNode {
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

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null)
                return head;
            ListNode currentNode = head;
            int currentVal = head.val;
            while (true) {
                if (currentNode.next == null)
                    break;

                if (currentNode.next.val == currentVal) {
                    currentNode.next = currentNode.next.next;
                    continue;
                }
                if (currentNode.next == null)
                    break;
                currentNode = currentNode.next;
                currentVal = currentNode.val;
            }
            return head;

        }
    }
}
