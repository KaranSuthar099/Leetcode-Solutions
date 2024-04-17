import java.util.Arrays;

public class Q4_Median_Of_Two_Sorted_Array {
    public static int[] sortedSumOfArrays(int[] nums1, int[] nums2) {
        int[] sum = new int[nums1.length + nums2.length];
        int last = 0;
        int counter = 0;

        for (int i=0; i< nums1.length; i++){
            sum[i] = nums1[i];
            last = i;
        }

        if (nums1.length == 0 )
            last--;
        for (int i =last+1; i<last+nums2.length+1; i++){
            sum[i] = nums2[counter];
            counter++;
        }
        Arrays.sort(sum);
        return sum;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = sortedSumOfArrays(nums1, nums2);
        int l = nums3.length;
        if (l%2 == 0){
            return (double) (nums3[l/2-1]+nums3[l/2])/2;
        }else
            return nums3[l/2];

    }
}
