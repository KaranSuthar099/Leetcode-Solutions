import java.util.Arrays;
import java.util.HashMap;

public class Q506_Relative_Ranks {
    public static String[] findRelativeRanks(int[] score) {
        int[] s = Arrays.stream(score).sorted().toArray();

        HashMap<Integer, String> map = new HashMap<>();
        String[] retArray = new String[s.length];

        int rank = 1;
        for (int i = s.length - 1; i >= 0; i--) {
            if (rank > 3) map.put(s[i], String.valueOf(rank));
            else if (rank == 3) map.put(s[s.length - 3], "Bronze Medal");
            else if (rank == 2) map.put(s[s.length - 2], "Silver Medal");
            else if (rank == 1) map.put(s[s.length - 1], "Gold Medal");
            rank++;

        }
        rank = 0;
        for (int value : score) {
            retArray[rank++] = map.get(value);
        }
        return retArray;
    }

    public static void main(String[] args) {
        int[] score = {1, 2, 3};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }
}
