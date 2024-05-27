public class Q287_Find_the_Duplicate_Number {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 4, 2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        // using boolean array
        int[] array = new int[nums.length];
        for (int num : nums) {
            array[num - 1]++;
        }

        for (int i = 0; i<array.length; i++){
            if (array[i] > 1) return i+1;
        }
        return -1;
    }
}
