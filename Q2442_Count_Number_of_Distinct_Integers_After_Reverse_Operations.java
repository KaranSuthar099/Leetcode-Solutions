import java.util.HashSet;

public class Q2442_Count_Number_of_Distinct_Integers_After_Reverse_Operations {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
            if (i > 10) {
                int reversedNum = 0;
                while (i > 0) {
                    reversedNum = reversedNum * 10 + i % 10;
                    i /= 10;
                }
                set.add(reversedNum);
            }
        }
        return set.size();
    }
}
