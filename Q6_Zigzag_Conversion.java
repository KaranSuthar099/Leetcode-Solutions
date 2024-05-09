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
        ArrayList<char[]> retArray = new ArrayList<>();
        while (iterator == 0 || iterator == numRows) {
            if (iterator == 0) {
                char[] element = new char[numRows];
                while (iterator < numRows && index < sLength) {
                    element[iterator++] = s.charAt(index++);
                }
                retArray.addLast(element);
            } else if (iterator == numRows) {
                iterator -= 2;
                while (iterator > 0 && index < sLength) {
                    char[] element = new char[numRows];
                    element[iterator] = s.charAt(index++);
                    retArray.addLast(element);
                    iterator--;
                }
                if (index == sLength) break;

            }
        }

        StringBuilder retString = new StringBuilder();
        int rsLength = 0;
        index = 0;

        while (rsLength != sLength) {
            for (int i = 0; i < retArray.size(); i++){
                char c = retArray.get(i)[index];
                if((int) c >0) {
                    retString.append(c);
                    rsLength++;
                }
            }
            index++;
        }

        return retString.toString();
    }

}
