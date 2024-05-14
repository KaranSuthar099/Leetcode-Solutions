import java.util.Stack;

public class Q150_Evaluate_Reverse_Polish_Notation {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String c: tokens){
            if (c.equals("+")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first + second);
            } else if (c.equals("-")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            } else if (c.equals("*")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first * second);
            } else if (c.equals("/")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first / second);
            } else stack.push(Integer.parseInt(c));

        }
        return stack.pop();
    }

}
