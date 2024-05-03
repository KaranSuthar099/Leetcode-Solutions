import java.util.Stack;

public class Q151_Reverse_Words_in_a_String {
    public static String reverseWords(String s) {
        s = s.trim();
        Stack<StringBuilder> stringStack  = new Stack<>();
        StringBuilder word = new StringBuilder();

        // to store all the words in stack
        for (char i: s.toCharArray()){
            if (Character.isAlphabetic(i) || Character.isDigit(i)){
                word.append(i);
            }else if (Character.isSpaceChar(i)){
                if (word.isEmpty())
                    continue;
                stringStack.push(word);
                word = new StringBuilder();
            }
        }
        // adding the trailing word
        stringStack.push(word);

        // reversing the sentence
        StringBuilder retString = new StringBuilder();
        while(!stringStack.isEmpty()){
            retString.append(stringStack.pop()).append(' ');
        }
        return retString.toString().trim();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }



}
