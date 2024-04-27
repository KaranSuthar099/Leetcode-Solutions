public class Q86_Partition_List {

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

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode iterator = head;
        ListNode headSmaller = null;
        ListNode headGreater = null;
        ListNode currentSmaller = null;
        ListNode currentGreater = null;

        while (iterator != null) {
            if (iterator.val < x) {
                if (headSmaller == null) {
                    headSmaller = new ListNode(iterator.val);
                    currentSmaller = headSmaller;
                }else {
                    currentSmaller.next = new ListNode(iterator.val);
                    currentSmaller = currentSmaller.next;
                }
            } else {
                if (headGreater == null) {
                    headGreater = new ListNode(iterator.val);
                    currentGreater = headGreater;
                }else {
                    currentGreater.next = new ListNode(iterator.val);
                    currentGreater = currentGreater.next;
                }
            }
            iterator = iterator.next;
        }
        if (headSmaller != null && headGreater!=null){
            head = headSmaller;
            currentSmaller.next = headGreater;
        }else if (headSmaller == null) return headGreater;
        else return headSmaller;

        return head;

    }

}
