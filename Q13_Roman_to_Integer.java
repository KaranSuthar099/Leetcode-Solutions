public class Q13_Roman_to_Integer {
    public static void main(String[] args) {
        System.out.println("roman number MMMCMXCIX int integer is " + romanToInt("MMMCMXCIX"));
    }

    public static int romanCharToInt(char roman) {
        if (roman == 'I') return 1;
        else if (roman == 'V') return 5;
        else if (roman == 'X') return 10;
        else if (roman == 'L') return 50;
        else if (roman == 'C') return 100;
        else if (roman == 'D') return 500;
        else return 1000;

    }

    public static int romanToInt(String s) {

        int integer = romanCharToInt(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int prev = romanCharToInt(s.charAt(i - 1));
            int current = romanCharToInt(s.charAt(i));
            if (current <= prev) {
                integer += current;
            } else {
                integer -= prev;
                integer += current - prev;
            }
        }
        return integer;

    }
}
