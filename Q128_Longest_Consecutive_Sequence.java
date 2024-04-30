import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;

public class Q128_Longest_Consecutive_Sequence {
    public static int longestConsecutive(int[] nums) {
        //return the length of longest consecutive array

        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int longestSequence = 0;
        int currentSequence = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) ;
            else if (nums[i + 1] == nums[i] + 1)
                currentSequence++;
            else {
                if (currentSequence > longestSequence) longestSequence = currentSequence;
                currentSequence = 1;
            }
        }
        if (currentSequence > longestSequence) longestSequence = currentSequence;
        return longestSequence;
    }

//    public static int longestConsecutive(int[] nums) {
//        //return the length of longest consecutive array
//        Arrays.sort(nums);
//
//        Set<Integer> setChar = new HashSet<>();
//        for (int i : nums) {
//            setChar.add(i);
//        }
//
//        int longestConsecutive = 0;
//        for (int number : nums) {
//            int consecutiveCount = 1;
//            while (setChar.contains(number + 1)) {
//                setChar.remove(number+1);
//                consecutiveCount++;
//                number++;
//            }
//            if (consecutiveCount > longestConsecutive) longestConsecutive = consecutiveCount;
//        }
//        return longestConsecutive;
//    }
}
