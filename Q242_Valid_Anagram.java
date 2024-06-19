import java.util.Arrays;

public class Q242_Valid_Anagram {

    public boolean isAnagram(String s, String t) {
        // make hashMaps of both the arrays
        int[] mapS = charFrequency(s);
        int[] mapT = charFrequency(t);

        return Arrays.equals(mapS, mapT);
    }

    public int[] charFrequency(String s){
        int[] frequency = new int[26];
        for (char c: s.toCharArray()){
            frequency[c - 97] ++;
        }

        return frequency;
    }

}
