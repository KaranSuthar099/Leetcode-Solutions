public class Q2108_Find_First_Palindromic_String_in_the_Array {

    public static void main(String[] args) {
        String[] words = {"notapalindrome", "racecar"};
        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {
        boolean isPal;
        int counter;
        int length;
        for (String s : words) {
            // check if the word is palindromic
            isPal = true;
            length = s.length();
            counter = length - 1;
            for (int j = 0; j < length/ 2; j++) {
                if (s.charAt(counter) != s.charAt(j)) {
                    isPal = false;
                    break;
                }
                counter--;
            }
            if (isPal) return s;
        }
        return "";

    }
}
