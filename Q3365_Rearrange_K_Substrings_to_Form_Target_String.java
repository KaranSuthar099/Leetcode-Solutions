import java.util.HashMap;

public class Q3365_Rearrange_K_Substrings_to_Form_Target_String {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        if (t.length() % k != 0 || s.length() != t.length()) return false;

        // divide s into k equal parts
        // find if the anagraphs can be rearranged into t

        int index = 0;
        int partLength = s.length()/k;
        HashMap<String, Integer> mapS = new HashMap<>();

        for( int i = 0; i< s.length(); i+=partLength){
            String substringOfS = s.substring(i, i+partLength);

            if(mapS.containsKey(substringOfS)) mapS.put(substringOfS, mapS.get(substringOfS)+1);
            else mapS.put(substringOfS, 1);
        }

        for( int i = 0; i<t.length(); i+=partLength){
            String substringOfT = t.substring(i, i+partLength);

            if(!mapS.containsKey(substringOfT) || mapS.get(substringOfT) == 0) return false;
            else mapS.put(substringOfT, mapS.get(substringOfT)-1);

        }

        return true;
    }
}
