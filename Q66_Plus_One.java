import java.util.Arrays;

public class Q66_Plus_One {
    public static int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
        } else {
            int carry = -1;
            int index = digits.length - 1;
            while (carry != 0 && index != -1) {
                int number = digits[index] + 1;
                digits[index--] = number % 10;
                carry = number / 10;
            }
            if (carry != 0) {
                int[] retArray = new int[digits.length + 1];
                retArray[0] = carry;
                for (int i = 0; i < digits.length; i++) {
                    retArray[i + 1] = digits[i];
                }
                return retArray;
            } else return digits;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
