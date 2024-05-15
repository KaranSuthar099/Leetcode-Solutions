public class Q231_Power_of_Two {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        else if ((n & n-1) == 0) return true;
        else return false;
    }
}
