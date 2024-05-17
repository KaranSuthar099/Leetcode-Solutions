import java.util.ArrayList;
import java.util.List;

public class Q17_Letter_Combinations_of_a_Phone_Number {
    public static void letterComb(String digits, int index, String currentString, ArrayList<String> retList) {
        if (index == digits.length()) {
            retList.add(currentString);
            return;
        }

        if (digits.charAt(index) == '2') {
            letterComb(digits, index + 1, currentString + "a", retList);
            letterComb(digits, index + 1, currentString + "b", retList);
            letterComb(digits, index + 1, currentString + "c", retList);
        } else if (digits.charAt(index) == '3') {
            letterComb(digits, index + 1, currentString + "d", retList);
            letterComb(digits, index + 1, currentString + "e", retList);
            letterComb(digits, index + 1, currentString + "f", retList);
        } else if (digits.charAt(index) == '4') {
            letterComb(digits, index + 1, currentString + "g", retList);
            letterComb(digits, index + 1, currentString + "h", retList);
            letterComb(digits, index + 1, currentString + "i", retList);
        } else if (digits.charAt(index) == '5') {
            letterComb(digits, index + 1, currentString + "j", retList);
            letterComb(digits, index + 1, currentString + "k", retList);
            letterComb(digits, index + 1, currentString + "l", retList);
        } else if (digits.charAt(index) == '6') {
            letterComb(digits, index + 1, currentString + "m", retList);
            letterComb(digits, index + 1, currentString + "n", retList);
            letterComb(digits, index + 1, currentString + "o", retList);
        } else if (digits.charAt(index) == '7') {
            letterComb(digits, index + 1, currentString + "p", retList);
            letterComb(digits, index + 1, currentString + "q", retList);
            letterComb(digits, index + 1, currentString + "r", retList);
            letterComb(digits, index + 1, currentString + "s", retList);
        } else if (digits.charAt(index) == '8') {
            letterComb(digits, index + 1, currentString + "t", retList);
            letterComb(digits, index + 1, currentString + "u", retList);
            letterComb(digits, index + 1, currentString + "v", retList);
        } else {
            letterComb(digits, index + 1, currentString + "w", retList);
            letterComb(digits, index + 1, currentString + "x", retList);
            letterComb(digits, index + 1, currentString + "y", retList);
            letterComb(digits, index + 1, currentString + "z", retList);
        }

    }

    public static List<String> letterCombinations(String digits) {
        ArrayList<String> retList = new ArrayList<>();
        if (digits.isEmpty()) return new ArrayList<>();
        letterComb(digits, 0, "", retList);
        return retList;
    }

}
