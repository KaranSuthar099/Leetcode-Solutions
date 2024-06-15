public class Q155_Min_Stack {
    class MinStack {
        Node head;
        Node tail;
        Node min;

        public MinStack() {
            head = null;
        }

        public void push(int val) {
            if (min == null) {
                min = new Node(val, null);
            } else if (min.val >= val) {
                min.next = new Node(val, min);
                min = min.next;
            }

            if (head == null || tail == null) {
                head = new Node(val, null);
                tail = head;
                return;
            }

            tail.next = new Node(val, tail);
            tail = tail.next;
        }

        public void pop() {
            if (head == null) {
                return;
            }
            if (min != null && tail.val == min.val) {
                min = min.prev;
            }
            tail = tail.prev;
        }

        public int top() {
            return tail.val;
        }

        public int getMin() {
            return min.val;
        }

        private class Node {
            Node prev;
            Node next;
            int val;

            Node(int val, Node prev) {
                this.prev = prev;
                this.val = val;
            }
        }
    }

}
