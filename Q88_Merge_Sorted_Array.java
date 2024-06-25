import java.util.Arrays;

public class Q88_Merge_Sorted_Array {

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {7, 8, 9};

        merge(nums1, 3, nums2, 3);

        System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int iterator = nums1.length-1;

        while (iterator >= 0){
            if (n < 0) return;
            if (m >= 0 && nums1[m] > nums2[n]){
                nums1[iterator--] = nums1[m--];
            } else {
                nums1[iterator--] = nums2[n--];
            }
        }

    }


}
