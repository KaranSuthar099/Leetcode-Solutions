public class Q977_Squares_of_a_Sorted_Array {

    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length -1;

        int[] retArray = new int[nums.length];
        int iterator = nums.length -1;
        while (iterator >= 0){
            if (nums[start] * nums[start] < nums[end] * nums[end]){
                retArray[iterator--] = nums[end] * nums[end--];
            } else {
                retArray[iterator--] = nums[start] * nums[start++];
            }
        }

        return retArray;
    }

}
