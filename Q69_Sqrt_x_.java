public class Q69_Sqrt_x_ {
    public int mySqrt(int x) {
        long start = 0;
        long end = x;

        while (start <= end) {
            long middle = start + (end - start) / 2;
            long square = middle * middle;

            if (square > x) {
                end = middle - 1;
            } else if (square < x) {
                start = middle + 1;
            } else return (int) middle;
        }
        return (int) end;
    }
}
