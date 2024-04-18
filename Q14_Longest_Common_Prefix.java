public class Q14_Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        int min = 201;

        for (String s : strs) {
            if (s.length() < min)
                min = s.length();
        }
        boolean flag = false;
        for (int i = 0; i < min; i++) {
            char prefixChar = strs[0].charAt(i);
            for (String s : strs) {
                if (!(s.charAt(i) == prefixChar)) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
            commonPrefix += prefixChar;
        }
        return commonPrefix;
    }

    public static void main(String[] args) {
        String[] words = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(words));

    }
}
