import static java.lang.Integer.reverse;

public class Q7_Reverse_Integer {
    public static int reverse(int x) {
        long revstring =0;
        while (true){
            revstring += x%10;
            x /= 10;
            if (x == 0)
                break;
            revstring *= 10;
        }
        if (revstring <2147483648L-1 && revstring> -2147483648L)
            return (int)revstring;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
