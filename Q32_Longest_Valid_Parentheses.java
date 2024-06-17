import java.util.Stack;

public class Q32_Longest_Valid_Parentheses {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()()(()()()(()()()()"));
    }

    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int longestValid = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    longestValid = Math.max(longestValid, i - stack.peek());
                }
            }

        }

        return longestValid;
    }

}
