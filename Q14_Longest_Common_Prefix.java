import java.util.Arrays;

public class Q14_Longest_Common_Prefix {
    //    public static String longestCommonPrefix(String[] strs) {
//        String commonPrefix = "";
//        int min = 201;
//
//        for (String s : strs) {
//            if (s.length() < min)
//                min = s.length();
//        }
//        boolean flag = false;
//        for (int i = 0; i < min; i++) {
//            char prefixChar = strs[0].charAt(i);
//            for (String s : strs) {
//                if (!(s.charAt(i) == prefixChar)) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag)
//                break;
//            commonPrefix += prefixChar;
//        }
//        return commonPrefix;
//    }
//    this approach uses first and last charachter and uses array of chars which makes it way faster
    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i])
                break;
            commonPrefix.append(first[i]);
        }

        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        String[] words = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(words));

    }
}
