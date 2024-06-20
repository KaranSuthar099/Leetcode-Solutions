import java.util.HashSet;

public class Q771_Jewels_and_Stones {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelSet = new HashSet<>();
        for (char c: jewels.toCharArray()){
            jewelSet.add(c);
        }

        int jewelCount = 0;
        for (char c: stones.toCharArray()){
            if (jewelSet.contains(c)) jewelCount++;
        }

        return jewelCount;
    }

}
