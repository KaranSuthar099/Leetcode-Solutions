public class Q5_Longest_Palindromic_Substring {
    public static String longestPalindrome(String s) {
        char[] sChar = s.toCharArray();

        int maxLength = 0;
        int maxLeft = 0;
        int maxRight = 0;

        int size = sChar.length;

        int left=0;
        int right=0;

        for (int i = 0; i<sChar.length; i++){

            // for odd length palindrome
            left = right = i;
            while (left >=0 && right< size && sChar[left] == sChar[right]){
                if ((right - left + 1 ) > maxLength  ){
                    maxLength = right -left +1;
                    maxLeft = left;
                    maxRight = right;
                }
                right++;
                left--;
            }

            // for even length palindromes
            left = i;
            right = i+1;
            while (left >=0 && right< size && sChar[left] == sChar[right]){
                if ((right - left + 1 ) > maxLength  ){
                    maxLength = right -left +1;
                    maxLeft = left;
                    maxRight = right;
                }
                right++;
                left--;
            }

        }
        return s.substring(maxLeft, maxRight +1);

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaa"));
    }
}
