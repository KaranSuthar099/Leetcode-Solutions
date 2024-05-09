import java.util.Arrays;

public class Q3075_Maximize_Happiness_of_Selected_Children {
    public static long maximumHappinessSum(int[] happiness, int k) {
        long retNumber = 0;
        int index = happiness.length - 1;
        int element;
        Arrays.sort(happiness);
        for (int i = 0; i < k; i++) {
            element = happiness[index--] - i;
            if (element > 0) retNumber += element;
        }
        return retNumber;
    }
}
