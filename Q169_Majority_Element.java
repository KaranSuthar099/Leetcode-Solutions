import java.util.HashMap;

public class Q169_Majority_Element {

    public int majorityElement(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        HashMap<Integer, Integer> numberFrequency = new HashMap<>();
        int threshold = nums.length / 2;
        for (int i : nums) {
            if (numberFrequency.containsKey(i)) {
                int frequency = numberFrequency.get(i);

                if (frequency + 1 > threshold)
                    return i;

                numberFrequency.put(i, frequency + 1);
                continue;
            }
            numberFrequency.put(i, 1);
        }

        return -1;

    }

}
