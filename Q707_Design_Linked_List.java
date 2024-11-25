public class Q707_Design_Linked_List {
    Node head;

    public int get(int index) {
        Node currentNode = head;

        while ( currentNode != null && index > 0){
            currentNode = currentNode.next;
            index--;
        }

        if(currentNode == null) return -1;
        return currentNode.val;

    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        this.head = newNode;

    }

    public void addAtTail(int val) {
        if(head == null) {
            head = new Node(val);
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = new Node(val);

    }

    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
            return;
        }

        Node prevNode = head;
        for (int i = 0; i<index-1; i++){
            if(prevNode == null) return;
            prevNode = prevNode.next;
        }

        if(prevNode == null) return;

        if(prevNode.next == null){
            prevNode.next = new Node(val);
            return;
        }

        Node newNode = new Node(val);
        newNode.next = prevNode.next;
        prevNode.next = newNode;


    }

    public void printList(){
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void deleteAtIndex(int index) {
        if(index == 0){
            if(head != null){
                head = head.next;
            }
            return;
        }


        Node currentNode = head;

        for(int i = 0; i<index-1; i++){
            if(currentNode == null) return;
            currentNode = currentNode.next;
        }

        if(currentNode == null) return;

        if(currentNode.next != null ){
            currentNode.next = currentNode.next.next;

        }

    }
}

class Node{
    int val;
    Node prev;
    Node next;

    public Node(int val){
        this.val = val;
    }
}
