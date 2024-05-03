public class Q27_Remove_Element {
    public int removeElement(int[] nums, int val) {
        int current = 0;
        for ( int i=0; i<nums.length; i++){
            if (nums[current] == val && nums[i] != val) {
                nums[current++] = nums[i];
                nums[i] = val;
            }
            else if (nums[current] != val) current++;
        }
        return current;
    }
}
