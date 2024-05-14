public class Q172_Factorial_Trailing_Zeroes {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(3125));
    }

    public static int trailingZeroes(int n) {
        int fiveCount = 0;
        for (int i = 5; i <= n; i *= 5) {
            fiveCount += n/i;
        }
        return fiveCount;
    }
}
