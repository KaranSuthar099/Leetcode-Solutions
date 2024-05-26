import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q442_Find_All_Duplicates_in_an_Array {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> retArray = new ArrayList<>();

        // copying the list in set
        for (int i : nums) {
            if (set.contains(i))
                retArray.add(i);
            else
                set.add(i);
        }

        return retArray;
    }
}
