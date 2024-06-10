public class Q3136_Valid_Word {

    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        int[] vowels = {};

        int vowelCount = 0;
        int consonantCount = 0;
        for (char c: word.toCharArray()){
            // check if small alphabet
            if (c<91 && c> 64 || ( c > 96 && c < 123)){
                boolean isVowel = false;
                for (char v: "aeiouAEIOU".toCharArray()){
                    if (c == v){
                        vowelCount++;
                        isVowel = true;
                        break;
                    }
                }
                if (!isVowel) consonantCount++;
            } else if (!( c > 47 && c < 58)){
                // the char is not a number
                return false;
            }
        }

        if (vowelCount >=1 && consonantCount >=1) return true;
        return false;


    }

}
