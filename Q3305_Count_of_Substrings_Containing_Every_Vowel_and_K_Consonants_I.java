import java.util.HashSet;

public class Q3305_Count_of_Substrings_Containing_Every_Vowel_and_K_Consonants_I {
    public int countOfSubstrings(String word, int k) {

        int validSubstringCount = 0;

        for (int i = 0; i < word.length(); i++) {
            HashSet<Character> vowelInSubstring = new HashSet<>();
            int consonants = 0;
            for (int j = i; j < word.length(); j++) {
                char c = word.charAt(j);
                if (isVowel(c)) {
                    vowelInSubstring.add(c);
                } else {
                    consonants++;
                }

                if (vowelInSubstring.size() == 5 && consonants == k) validSubstringCount++;
            }
        }

        return validSubstringCount;

    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
