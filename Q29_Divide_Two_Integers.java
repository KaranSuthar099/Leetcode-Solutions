import java.util.Arrays;

public class Q29_Divide_Two_Integers {
    //    public static int divide(int dividend, int divisor) {
//
//        if (divisor == -1 || divisor ==1 ){
//            if (dividend == Integer.MAX_VALUE){
//
//            }
//        }
//
//        int negative;
//        if (divisor <0){
//            negative = -1;
//        }else{
//            negative = 1;
//        }
//
//
//        int counter = 0;
//        while (counter * divisor * negative <= dividend) {
//            counter++;
//        }
//        return (counter -1) * negative;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(divide(-2147483648, -1));
//        int[] nums = new int[10];
//
//    }
    public static int divide(int dividend, int divisor) {

        long dividendL = dividend;
        long divisorL = divisor;

        // If we have 0 as divisor return the divisor
        if (dividendL == 0)
            return 0;

        long quotient = 0;

        boolean isDividendNegative = dividendL < 0;
        boolean isDivisorNegative = divisorL < 0;

        if (isDividendNegative)
            dividendL = Long.parseLong(String.valueOf(dividendL).substring(1));

        if (isDivisorNegative)
            divisorL = Long.parseLong(String.valueOf(divisorL).substring(1));

        long temp = 0;

        for (int i = 31; i >= 0; --i) {

            if (temp + (divisorL << i) <= dividendL) {
                temp += divisorL << i;
                quotient |= 1L << i;
            }
        }

        if (isDivisorNegative ^ isDividendNegative)
            quotient = -quotient;

        if (quotient < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if (quotient > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int) quotient;
    }

}
