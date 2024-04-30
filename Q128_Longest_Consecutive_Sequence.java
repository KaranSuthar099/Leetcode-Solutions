import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q128_Longest_Consecutive_Sequence {
    public static int longestConsecutive(int[] nums) {
        //return the length of longest consecutive array
        Arrays.sort(nums);

        Set<Integer> setChar = new HashSet<>();
        for (int i : nums) {
            setChar.add(i);
        }

        int longestConsecutive = 0;
        for (int number : nums) {
            int consecutiveCount = 1;
            while (setChar.contains(number + 1)) {
                setChar.remove(number+1);
                consecutiveCount++;
                number++;
            }
            if (consecutiveCount > longestConsecutive) longestConsecutive = consecutiveCount;
        }
        return longestConsecutive;
    }
}
