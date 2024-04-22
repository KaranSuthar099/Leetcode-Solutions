public class Q58_Length_of_Last_Word {
    public int lengthOfLastWord(String s) {

        char[] newS = s.trim().toCharArray();
        int size = newS.length;

        int length = 0;
        for (int i =size-1; i>-1; i--){
            if (newS[i] == ' ' )
                break;
            length += 1;
        }
        return length;
    }
}
