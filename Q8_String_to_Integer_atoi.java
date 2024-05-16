public class Q8_String_to_Integer_atoi {

    public static boolean InBounds(char sign, long result) {
        if (sign == '-') return result < (long) Integer.MAX_VALUE + 1;
        else return result <= Integer.MAX_VALUE;
    }

    public static int myAtoi(String s) {
        long result = 0;
        char sign = 'u';
        boolean isDigitFound = false;

        // this code is to extract numbers
        for (char i : s.toCharArray()) {
            if (Character.isAlphabetic(i) || i == '.') {
                break;
            } else if (Character.isSpaceChar(i)) {
                if (sign != 'u') break;
                if (isDigitFound) break;
            } else if (Character.isDigit(i)) {
                isDigitFound = true;
                if (sign == 'u') sign = 'x';
                if (InBounds(sign, result)) {
                    result *= 10;
                    result += (i - 48);
                } else break;

            } else if (i == '+' || i == '-') {
                if (sign == 'u') sign = i;
                else break;
            }
        }

        System.out.println((result));
        // this is to return value as per integer bounds
        if (InBounds(sign, result)) {
            if (sign == '-') return (int) result * -1;
            return (int) result;
        } else if (sign == '-') return Integer.MIN_VALUE;
        else return Integer.MAX_VALUE;
    }

}
