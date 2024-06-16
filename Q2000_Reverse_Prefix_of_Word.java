public class Q2000_Reverse_Prefix_of_Word {

    public String reversePrefix(String word, char ch) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                StringBuilder retString = new StringBuilder();
                for (int j = i; j >= 0; j--) {
                    retString.append(word.charAt(j));
                }
                retString.append(word.substring(i + 1));
                return retString.toString();
            }
        }
        return word;
    }
}
