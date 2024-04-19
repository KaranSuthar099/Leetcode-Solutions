public class Q19_Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 1;
        ListNode currentNode = head;
        while (currentNode.next != null) {
            size++;
            currentNode = currentNode.next;
        }
        if (size == 1 && n == 1) {
            head = null;
            return head;
        }
        int delIndex = size - n;
        if (delIndex == 0) {
            head = head.next;
            return head;
        }

        currentNode = head;
        int currentIndex = 0;
        while (currentIndex < delIndex - 1) {
            currentIndex++;
            currentNode = currentNode.next;
        }
        if (currentNode.next == null)
            currentNode.next = null;
        else
            currentNode.next = currentNode.next.next;
        return head;

    }
}
