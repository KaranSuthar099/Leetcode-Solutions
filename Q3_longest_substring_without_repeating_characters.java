public class Q3_longest_substring_without_repeating_characters {
    public static int charInString(char c, String s, int start, int end) {
        int exists = -1;
        for (int i = start; i < end; i++) {
            if (s.charAt(i) == c) {
                exists = i;
            }
        }
//        if result is -1 then character not present in the substring
        return exists; //+1;
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty())
            return 0;
        int maxStart = 0;
        int maxEnd = 0;
        int start = 0;
        int end;
        for (int i = 0; i < s.length(); i++) {
            int result = charInString(s.charAt(i), s, start, i);
            if (result != -1) {
                start = result+1;
            }
            end = i; //+1
            if ( end - start > maxEnd - maxStart ){
                maxEnd = end;
                maxStart = start;
            }
        }
        return maxEnd - maxStart+1;

    }
}
