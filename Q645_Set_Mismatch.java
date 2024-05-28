import java.util.Arrays;

public class Q645_Set_Mismatch {

    public static void main(String[] args) {
        //            0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        int[] nums = {3, 2, 3, 4, 6, 5};
        System.out.println(Arrays.toString(findErrorNums(nums)));
        System.out.println(Arrays.toString(nums));

    }

    public static int[] findErrorNums(int[] nums) {
        // using boolean array
        boolean[] map = new boolean[nums.length];
        int repeatingElement = -1;
        for (int i: nums){
            if (!map[i - 1]) map[i-1] = true;
            else repeatingElement = i;
        }

        for (int i = 0; i<map.length; i++){
            if (!map[i]) return new int[]{repeatingElement, i+1};
        }
        return new int[]{-1, -1};
    }

}
