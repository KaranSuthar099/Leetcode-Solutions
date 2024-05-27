import java.util.HashSet;

public class Q268_Missing_Number {

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {
        // using hashSet
        HashSet<Integer> set = new HashSet<>();
        for (int i: nums){
            set.add(i);
        }
        int element;
        for (element = 0; element<nums.length; element++){
            if (!set.contains(element)) break;
        }

        return element;
    }

}
