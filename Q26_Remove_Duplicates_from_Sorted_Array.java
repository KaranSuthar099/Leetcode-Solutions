public class Q26_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        // now solving using two pointer
        int current = 0;
        for(int i = 1; i<nums.length; i++){
            if (nums[i] != nums[current])
                nums[++current] = nums[i];
        }
        return ++current;
    }
}
