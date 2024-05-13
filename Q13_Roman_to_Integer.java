import java.util.HashMap;

public class Q13_Roman_to_Integer {
    public static void main(String[] args) {
        System.out.println("roman number MMMCMXCIX int integer is " + romanToInt("MMMCMXCIX") );
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanNumber = new HashMap<>();
        romanNumber.put('I', 1);
        romanNumber.put('V', 5);
        romanNumber.put('X', 10);
        romanNumber.put('L', 50);
        romanNumber.put('C', 100);
        romanNumber.put('D', 500);
        romanNumber.put('M', 1000);

        int integer = romanNumber.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int prev = romanNumber.get(s.charAt(i - 1));
            int current = romanNumber.get(s.charAt(i));
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
