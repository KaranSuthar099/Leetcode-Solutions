public class Q2124_Check_if_All_As_Appears_Before_All_Bs {
    public boolean checkString(String s) {
        char current = 'a';
        for (char c : s.toCharArray()) {
            if (current == 'a' && c == 'b')
                current = 'b';
            if (current == 'b' && c == 'a')
                return false;
        }
        return true;
    }
}
