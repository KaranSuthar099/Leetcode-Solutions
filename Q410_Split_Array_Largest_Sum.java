public class Q410_Split_Array_Largest_Sum {

    public static int splitArray(int[] nums, int k) {
        int start = -1;
        int end = 0;
        // calculating max and sum
        for (int i: nums ){
            if (i > start) start = i;
            end += i;
        }

        int peices = 0;
        int middle;

        while (start< end){
            middle = start + (end - start)/2;

            peices = doPeices(nums, middle);
            if (peices <= k){
                end = middle;
            } else start = middle +1;
        }
        return start;
    }

    public static int doPeices(int[] nums, int size){
        int peices = 1;

        int sum = 0;
        for (int i:nums){
            if (sum+i > size) {
                sum = 0;
                peices++;
            }
            sum+= i;
        }
        return peices;
    }

}
