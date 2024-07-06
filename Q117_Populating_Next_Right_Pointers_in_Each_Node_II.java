import java.util.LinkedList;
import java.util.Queue;

public class Q117_Populating_Next_Right_Pointers_in_Each_Node_II {

    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node start = null;
            
            int size = queue.size();
            for (int i = 0; i<size; i++){
                Node peek = queue.remove();
                if (peek == null) continue;

                if (start == null){
                    start = peek;
                } else {
                    start.next = peek;
                    start = start.next;
                }

                if (peek.left != null){
                    queue.add(peek.left);
                }
                if (peek.right != null){
                    queue.add(peek.right);
                }
            }
        }
        
        return root;
    }

    private class Node {
        int val;
        Node left;
        Node right;
        Node next;

    }
    
}
