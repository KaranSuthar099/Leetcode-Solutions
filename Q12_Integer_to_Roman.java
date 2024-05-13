import java.util.HashMap;

public class Q12_Integer_to_Roman {
    public static void main(String[] args) {
        System.out.println(intToRoman(10));

    }

    public static String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        // finding number length
        StringBuilder roman = new StringBuilder();
        String numS = String.valueOf(num);
        int denomination = (int) Math.pow(10, numS.length()-1); // once
        for (char c : numS.toCharArray()){
            int digit = c - 48;
            if (digit == 0) roman.append("");
            else if (digit == 5 || digit == 1)
                roman.append(map.get(digit * denomination));
            else if (digit == 4 || digit == 9)
                roman.append(map.get(denomination)).append(map.get((digit + 1) * denomination));
            else if (digit < 4)
                roman.append(map.get(denomination).repeat(digit));
            else
                roman.append(map.get(denomination * 5)).append(map.get(denomination).repeat(digit - 5));
            denomination /= 10;
        }
        return roman.toString();
    }

}
