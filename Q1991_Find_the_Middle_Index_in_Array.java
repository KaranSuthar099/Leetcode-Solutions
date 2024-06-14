public class Q1991_Find_the_Middle_Index_in_Array {

    public int findMiddleIndex(int[] nums) {
        if (nums.length == 1 ){
            return 0;
        }


        int rightSum = 0;
        for (int i:nums){
            rightSum += i;
        }

        int leftSum = 0;
        for (int i = 0; i<nums.length; i++){
            rightSum -= nums[i];
            if (leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }

        return -1;

    }

}
