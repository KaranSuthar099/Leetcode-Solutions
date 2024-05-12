public class Q204_Count_Primes {

    public static int countPrimes(int n) {
        if ( n == 0 || n == 1) return 0;

        boolean[] primes = new boolean[n];
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (primes[i]) continue;
            for (int j = 2; j*i< n; j++){
                primes[j*i] = true;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!primes[i]) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(49979));
    }

}
