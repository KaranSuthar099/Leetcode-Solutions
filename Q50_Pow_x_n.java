public class Q50_Pow_x_n {
    public static void main(String[] args) {
        System.out.println(myPow(2 ,10));
    }

    public static double pow(double x, int n){
        if (n == 1 || n == 0) return x;

        if (n%2 == 0) return pow(x*x, n/2);
        return x * pow(x*x, n/2);
    }

    public static double myPow(double x, int n) {
        if (n == 0 || x == 1) return 1;
        if (x == -1){
            if (n %2== 0) return 1;
            else return -1;
        }

        double extra = 1;
        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            if (n == Integer.MIN_VALUE) {
                n = Integer.MAX_VALUE;
                extra = x;
            } else n *= -1;
        }

        if (isNegative) return 1/pow(x, n) *extra;
        return pow(x, n);
    }

}
