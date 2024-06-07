import java.util.ArrayList;
import java.util.List;

public class Q77_Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> retList = new ArrayList<>();
        com(n, k, new ArrayList<>(), retList, 1);

        return retList;
    }

    public static void com(int n, int k, ArrayList<Integer> currentList, List<List<Integer>> retList, int start) {
        if (currentList.size() == k) {
            retList.add(new ArrayList<>(currentList));
            return;
        }

        for (int i = start; i <= n; i++) {
            currentList.add(i);

            com(n, k, currentList, retList, i +1);
            // backtrack
            currentList.removeLast();
        }
    }

}
