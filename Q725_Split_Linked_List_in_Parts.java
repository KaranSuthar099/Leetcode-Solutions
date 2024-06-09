public class Q725_Split_Linked_List_in_Parts {


    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        ListNode iterator = head;
        while (iterator != null) {
            size++;
            iterator = iterator.next;
        }

        ListNode[] retList = new ListNode[k];

        iterator = head;
        int index = 0;
        int extra = size % k;
        int splitSize = size / k;
        while (iterator != null) {
            ListNode element = iterator;
            retList[index++] = element;
            int end = splitSize;
            if (extra > 0) {
                end++;
                extra--;
            }

            for (int i = 1; i < end; i++) {
                iterator = iterator.next;
            }

            if (iterator != null) {
                ListNode next = iterator.next;
                iterator.next = null;
                iterator = next;
            }
        }

        return retList;

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
