import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q49_Group_Anagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] keyArray = s.toCharArray();
            Arrays.sort(keyArray);
            String key = Arrays.toString(keyArray);

            if (!map.containsKey(key)) {   // not containKeys
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());

    }

}
