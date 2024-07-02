public class Q116_Populating_Next_Right_Pointers_in_Each_Node {

    public Node connect(Node root) {
        if (root == null)
            return root;

        Node current = root;
        while (current != null) {
            // connect the childs
            Node next = current.left;

            while (current != null) {
                // if at leaf node
                if (current.left == null)
                    return root;

                // connect the left to right
                current.left.next = current.right;
                if (current.next != null) {
                    current.right.next = current.next.left;
                }
                current = current.next;
            }

            current = next;
        }

        return root;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

}
