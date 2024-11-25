import java.util.HashSet;

public class Q160_Intersection_of_Two_Linked_Lists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0;
        int sizeB = 0;

        ListNode currentNodeA = headA;
        ListNode currentNodeB = headB;

        // calculate the size
        while (currentNodeA != null) {
            sizeA++;
            currentNodeA = currentNodeA.next;

        }
        while (currentNodeB != null) {
            sizeB++;
            currentNodeB = currentNodeB.next;

        }

        // set the pointers acc to difference
        currentNodeA = headA;
        currentNodeB = headB;

        for (int i = Math.abs(sizeA - sizeB); i > 0; i--) {
            if (sizeA > sizeB) {
                currentNodeA = currentNodeA.next;
            } else {
                currentNodeB = currentNodeB.next;
            }
        }

        while (currentNodeA != null && currentNodeB != null) {
            if (currentNodeA == currentNodeB)
                return currentNodeA;
            currentNodeA = currentNodeA.next;
            currentNodeB = currentNodeB.next;
        }

        return null;
    }

//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        HashSet<ListNode> set = new HashSet<>();
//
//        ListNode currentNode = headA;
//        while(currentNode != null){
//            set.add(currentNode);
//            currentNode = currentNode.next;
//        }
//
//        currentNode = headB;
//        while(currentNode != null){
//            if(set.contains(currentNode)) return currentNode;
//            currentNode = currentNode.next;
//        }
//
//        return null;
//    }



}
