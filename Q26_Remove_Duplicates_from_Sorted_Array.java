import java.util.HashSet;

public class Q26_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> elements = new HashSet<>();

        int[] retNums = new int[nums.length];
        int counter = 0;
        for (int i:nums){
            if (!elements.contains(i)){
                nums[counter++] = i;
                elements.add(i);
            }
        }
        return elements.size();
    }
}
