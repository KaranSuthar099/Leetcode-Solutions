import java.util.Stack;

public class Q232_Implement_Queue_using_Stacks {
    class MyQueue {
        Stack<Integer> stack;
        public MyQueue() {
            stack = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
        }

        public int pop() {
            Stack<Integer> revStack = new Stack<>();
            // copy the stack in another stack
            while (!stack.isEmpty()) {
                revStack.push(stack.pop());
            }
            // now that the ends are removed
            // we can remove the element at the start
            int popped = revStack.pop();

            // now we will have to again copy all the elements into
            // original stack
            while (!revStack.empty()) {
                stack.push(revStack.pop());
            }

            return popped;
        }

        public int peek() {
            Stack<Integer> revStack = new Stack<>();
            // copy the stack in another stack
            while (!stack.isEmpty()) {
                revStack.push(stack.pop());
            }
            // now that the ends are removed
            // we can see the element at the start
            int popped = revStack.peek();

            while (!revStack.empty()) {
                stack.push(revStack.pop());
            }

            return popped;
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }

}
