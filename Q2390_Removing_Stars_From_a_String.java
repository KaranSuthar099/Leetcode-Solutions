import java.util.Stack;

public class Q2390_Removing_Stars_From_a_String {

    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()){
            if (c == '*') stack.pop();
            else stack.push(c);
        }

        StringBuilder retString = new StringBuilder();
        while (!stack.isEmpty()) retString.append(stack.pop());

        return retString.reverse().toString();
    }

}
