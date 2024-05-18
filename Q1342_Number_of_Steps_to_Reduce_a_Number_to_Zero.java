public class Q1342_Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

    public static int numberOfSteps(int num) {
        // using loop
        int count = 0;
        while (num != 1 && num != 0){
            if (num%2 == 0) {
                num/=2;
            }else {
                num -= 1;
            }
            count++;
        }

        if (num == 1) return ++count;
        return count;

    }
}
