public class Q2486_Append_Characters_to_String_to_Make_Subsequence {

    public static int appendCharacters(String s, String t) {
        int index = 0;

        // will be faster if we used char arrays instead
        char[] tArray = t.toCharArray();

        for (char ch: s.toCharArray()){
            if (index == t.length()) return 0;
            if (ch == tArray[index]) index++;
        }

        return t.length() - index;
    }

}
