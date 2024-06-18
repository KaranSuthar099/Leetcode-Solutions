import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q49_Group_Anagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s: strs){
            int[] keyArray = new int[26];
            for (char c: s.toCharArray()){
                keyArray[c-97]++;
            }

            // convert this to Stringbuilder
            String key = Arrays.toString(keyArray);


            if (map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(s);
                map.put(key, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key, list);
            }
        }

        return new ArrayList<>(map.values());

    }

}
