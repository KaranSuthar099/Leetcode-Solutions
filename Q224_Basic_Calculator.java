import java.util.Stack;

public class Q224_Basic_Calculator {
    public static void main(String[] args) {
        System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));
    }

    public static int calculate(String s) {
        return solve(s, 0)[0];
    }

    public static int[] solve(String s, int index) {

        boolean condition;
        if (s.charAt(index) == '(') {
            condition = s.charAt(index) != ')';
        } else condition = index < s.length();

        boolean firstRun = true;

        int prevNumber = 0;
        char prevSign = 'n';

        int i;
        for (i = index; condition; i++) {
            if ( i == s.length()) break;
            if (Character.isDigit(s.charAt(i))){
                int currentNumber = 0;
                while ( i < s.length() && Character.isDigit(s.charAt(i)) ){
                    currentNumber = currentNumber*10 + (s.charAt(i++) - 48);
                }

                if (i != s.length()) i--;

                if (prevSign == '+') prevNumber+=currentNumber;
                else if (prevSign == 'n') prevNumber = currentNumber;
                else prevNumber -= currentNumber;

            }else if (s.charAt(i) == '+' || s.charAt(i) == '-')
                prevSign = s.charAt(i);

            else if (s.charAt(i) ==  '('){
                if (i == index){
                    continue;
                }
                int[] result = solve(s, i);

                i = result[1]-1;

                if (prevSign == '+') prevNumber += result[0];
                else if (prevSign == 'n') prevNumber = result[0];
                else prevNumber -= result[0];

                continue;
            }

            // checking condition based on start

            if (s.charAt(index) == '(' && index != 0) {
                condition = s.charAt(i) != ')';
            } else condition = i < s.length();
        }

        return new int[]{prevNumber, i};
    }

}
