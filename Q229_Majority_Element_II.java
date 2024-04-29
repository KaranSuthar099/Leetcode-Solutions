import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q229_Majority_Element_II {
    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i: nums){
            if (frequency.containsKey(i)) frequency.put(i, frequency.get(i)+1);
            else frequency.put(i, 1);
        }
        List<Integer> retArray = new ArrayList<>(2);
        int index = 0;
        for (int i: frequency.keySet()){
            if (index == 2) break;
            if (frequency.get(i) > nums.length/3){
                retArray.add(i);
                index++;
            }
        }
        return retArray;

    }
}
