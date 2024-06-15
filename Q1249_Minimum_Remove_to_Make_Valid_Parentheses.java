import java.util.Stack;

public class Q1249_Minimum_Remove_to_Make_Valid_Parentheses {
    public String minRemoveToMakeValid(String s) {
        StringBuilder retString = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        int close = 0;
        for (char c : s.toCharArray()) {
            if (c == ')')
                close++;
        }

        for (char c : s.toCharArray()) {
            if (c == '(' ) {
                if (close > 0){
                    close--;
                    stack.push('(');
                    retString.append('(');
                }

            } else if ( c == ')'){
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    retString.append(')');
                } else close --;

            } else {
                retString.append(c);
            }
        }

        return retString.toString();
    }

}
