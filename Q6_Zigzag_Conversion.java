import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Q6_Zigzag_Conversion {
    public static void main(String[] args) {
        String statement = "PAYPALISHIRING";
        System.out.println("output   " + convert(statement, 4));
        System.out.println("expected " + "PINALSIGYAHRPI");
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        int stringIterator = 0;
        int arrayIterator = 0;
        int sLength = s.length();

        int[] indexString = new int[numRows];
        LinkedList<Character> retList = new LinkedList<>();
        while (stringIterator != s.length()) {
            if (arrayIterator == 0) {
                while (arrayIterator < numRows && stringIterator < sLength) {
                    retList.add(indexString[arrayIterator], s.charAt(stringIterator++));
                    for ( int i = arrayIterator; i<indexString.length; i++){
                        indexString[i]++;
                    }
                    arrayIterator++;
                }
            } else if (arrayIterator == numRows) {
                arrayIterator -= 2;
                while (arrayIterator > 0 && stringIterator < sLength) {
                    retList.add(indexString[arrayIterator], s.charAt(stringIterator++));
                    for ( int i = arrayIterator; i<indexString.length; i++){
                        indexString[i]++;
                    }
                    arrayIterator--;
                }
            }
        }

        StringBuilder retString = new StringBuilder();
        for ( char c: retList){
            retString.append(c);
        }

        return retString.toString();
    }

}
