import java.util.HashMap;
import java.util.Stack;

public class Q43_Multiply_Strings {
    public static String multiplyTochar(String num1, char num2) {
        // return the multiple of String to char as numbers in reverse
        if (num2 == '0') return "0";
        int m = num2 - 48;
        int carry = 0;
        StringBuilder retString = new StringBuilder();

        for (int i = num1.length() - 1; i >= 0; i--) {
            int multiple = ((int) num1.charAt(i) - 48) * m + carry;
            carry = multiple / 10;
            multiple = multiple % 10;
            retString.append((char) (multiple + 48));
        }
        if (carry != 0) retString.append((char) (carry + 48));
        return retString.toString();
    }

    public static HashMap<Integer, Character> packToStringArray(String bigNumber, String smallNumber) {
        // pass the parameters in way that specific way only
        // packing the numbers to array

        char[] numArray = bigNumber.toCharArray();
        HashMap<Integer, Character> retNumber = new HashMap<>();

        // this counter signifies x as that of in multiplying
        int xCounter = 0;
        int counter = smallNumber.length() - 1;
        for (int i = 0; i < smallNumber.length(); i++) {
            // for adding each multiple in the map
            String number = multiplyTochar(bigNumber, smallNumber.charAt(counter--));
            System.out.println(number);

            int carry = 0;
            int numberIndex = 0;//we have to iterate from the last
            // this loop is to add new number digit by digit
            int mapIndex;
            for (mapIndex = xCounter; mapIndex < number.length() + xCounter; mapIndex++) {
                if (retNumber.containsKey(mapIndex)) {
                    int prevDigit = retNumber.get(mapIndex) - 48;
                    int newDigit = prevDigit + carry + ((int) number.charAt(numberIndex++) - 48);
                    carry = newDigit / 10;
                    retNumber.put(mapIndex, (char) (newDigit % 10 + 48));
                } else if ((int) number.charAt(numberIndex) + carry == 58) {
                    retNumber.put(mapIndex, '0');
                    retNumber.put(mapIndex+1, '1');
                    carry /= 10;
                    numberIndex++;
                } else {
                    retNumber.put(mapIndex, (char) ((int) number.charAt(numberIndex++) + carry));
                    carry /= 10;
                }
            }
            while (carry != 0) {
                retNumber.put(mapIndex++, (char) (carry % 10 + 48));
                carry /= 10;
            }

            xCounter++;
        }

        return retNumber;
    }

    public static String multiply(String num1, String num2) {
        HashMap<Integer, Character> multiple;
        if (num1.length() < num2.length()) multiple = packToStringArray(num2, num1);
        else multiple = packToStringArray(num1, num2);

        Stack<Character> stack = new Stack<>();
        int counter = 0;
        while (multiple.containsKey(counter)) {
            stack.push(multiple.get(counter++));
        }

        StringBuilder retString = new StringBuilder();
        while (!stack.isEmpty()) {
            retString.append(stack.pop());
        }

        return retString.toString();

    }

    public static void main(String[] args) {
        System.out.println(multiply("65539", "83314"));
    }
}
