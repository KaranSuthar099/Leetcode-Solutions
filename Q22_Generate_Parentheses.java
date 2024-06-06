import java.util.ArrayList;
import java.util.List;

public class Q22_Generate_Parentheses {

    public static void generate(int n, int start, int end, ArrayList<Character> currentString, List<String> retList) {
        if (start == n && end == n) {
            StringBuilder parenthesis = new StringBuilder();
            for (char c : currentString) parenthesis.append(c);
            retList.add(parenthesis.toString());
            return;
        }
        if (start < n) {
            currentString.add('(');
            generate(n, start + 1, end, currentString, retList);
            currentString.removeLast();
        }
        if (end < start) {
            currentString.add(')');
            generate(n, start, end + 1, currentString, retList);
            currentString.removeLast();
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> retList = new ArrayList<>();
        generate(n, 0, 0, new ArrayList<>(), retList);
        return retList;
    }

}
