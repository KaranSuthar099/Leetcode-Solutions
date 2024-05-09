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

        int index = 0;
        int iterator = 0;
        int sLength = s.length();

        int[] indexString = new int[numRows];
        StringBuilder retString = new StringBuilder();

        while (iterator == 0 || iterator == numRows) {
            if (iterator == 0) {
                while (iterator < numRows && index < sLength) {
                    retString.insert(indexString[iterator], s.charAt(index++));
                    for ( int i = iterator; i<indexString.length; i++){
                        indexString[i]++;
                    }
                    iterator++;
                }
            } else if (iterator == numRows) {
                iterator -= 2;
                while (iterator > 0 && index < sLength) {
                    retString.insert(indexString[iterator], s.charAt(index++));
                    for ( int i = iterator; i<indexString.length; i++){
                        indexString[i]++;
                    }
                    iterator--;
                }
                if (index == sLength) break;

            }
        }

        return retString.toString();
    }

}
