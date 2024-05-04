import java.util.Arrays;

public class Q80_Remove_Duplicates_from_Sorted_Array_II {
    public static int removeDuplicates(int[] nums) {

        int current = 0;
        int prevElement = nums[current];
        int rep = -1;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            //[0, 0, 1, 1, 1, 1, 2, 2, 3]
            // to detect if an element is repeating more then twice
            if (nums[i] == prevElement) {
                rep++;
                // this condition becomes ture once an element starts to repeat
                if (rep > 1) {
                    continue;
                }
            } else {
                // logic for element repetion
                prevElement = nums[i];
                rep = 0;
            }
            k++;
            if ( nums[current] != nums[i])
                nums[current] = nums[i];
            current++;

        }
        return k;
    }
}
