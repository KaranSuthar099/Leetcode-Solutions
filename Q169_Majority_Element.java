import java.util.HashMap;

public class Q169_Majority_Element {

    public int majorityElement(int[] nums) {
        // boyer moore voting algorithm
        int count = 0;
        int element = -1;

        for (int i =0; i<nums.length; i++){
            // if count is zero then take up the current element
            if (count == 0){
                element = nums[i];
                count ++;
            }
            else if (nums[i] == element) count++;
            else count--;
        }
        return element;

    }

}
