public class Q28_Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static int strStr(String haystack, String needle) {
        char[] newHaystack = haystack.toCharArray();
        char[] newNeedle = needle.toCharArray();
        boolean flag = true;
        int index = -1;
        if (newHaystack.length < newNeedle.length)
            return index;
        for (int i = 0; i < newHaystack.length; i++) {
            if (newHaystack[i] == newNeedle[0]) {
                index = i;
                for (int j = 0; j < newNeedle.length; j++) {
                    if (i+j > newHaystack.length-1)
                        return -1;
                    if (!(newHaystack[i+j] == newNeedle[j])){
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    break;
                index = -1;
                flag = true;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issip"));
    }
}
