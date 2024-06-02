public class Q344_Reverse_String {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while (start <= end){
            char container = s[start];
            s[start++] = s[end];
            s[end--] = container;
        }
    }
}
