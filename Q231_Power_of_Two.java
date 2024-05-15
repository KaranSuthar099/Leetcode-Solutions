public class Q231_Power_of_Two {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 2) {
            if (n/2 == 1 || n == 1)return true;
            return false;
        }else{
            if (n%2 == 0) return isPowerOfTwo(n/2);
            return false;
        }
    }

}
