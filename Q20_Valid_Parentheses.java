import java.util.Stack;

public class Q20_Valid_Parentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray())
            if (isOpening(c)) stack.push(c);
            else if (isClosing(c)) try {
                if (!isOpeningOf(stack.pop(), c)) return false;
            } catch (java.util.EmptyStackException e) {
                return false;
            }
        return stack.isEmpty();

    }

    private boolean isOpening(char c) {
        return c == '(' || c == '{' || c == '[' || c == '<';
    }

    private boolean isClosing(char c) {
        return c == ')' || c == '}' || c == ']' || c == '>';
    }

    private boolean isOpeningOf(char opening, char c) {
        if (c == ')') return opening == '(';
        if (c == '}') return opening == '{';
        if (c == ']') return opening == '[';
        if (c == '>') return opening == '<';
        return false;
    }

}
