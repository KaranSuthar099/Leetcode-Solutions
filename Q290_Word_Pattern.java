import java.util.HashMap;
import java.util.HashSet;

public class Q290_Word_Pattern {

    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");
        if (pattern.length() != split.length) return false;
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!split[i].equals(map.get(c))) return false;
            } else {
                if (set.contains(split[i])) return false;
                else set.add(split[i]);

                map.put(c, split[i]);
            }
        }

        return true;
    }

}
