public class Q50_Pow_x_n {
    public static double myPow(double x, int n) {
        if (n == 0 || x == 1) return 1;
        if (x == -1){
            if (n %2== 0) return 1;
            else return -1;
        }

        // return x raised to the power n
        double pow = x;
        double extra = 1;
        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            if (n == Integer.MIN_VALUE) {
                n = Integer.MAX_VALUE;
                extra = x;
            } else n *= -1;
        }
        while (n != 0 && n != 1) {
            if (n % 2 == 0) {
                pow = pow * pow;
                n /= 2;
            } else {
                extra *= pow;
                n--;
            }
        }

        if (isNegative) return 1 / (pow * extra);
        return pow * extra;
    }

}
