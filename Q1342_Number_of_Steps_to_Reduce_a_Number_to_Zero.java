public class Q1342_Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static int numberOfSteps(int num) {
        // using recursion
        if (num == 1) return 1;
        if (num == 0) return 0;

        if (num%2==0) return 1+numberOfSteps(num/2);
        return 1+numberOfSteps(num-1);

    }
}
