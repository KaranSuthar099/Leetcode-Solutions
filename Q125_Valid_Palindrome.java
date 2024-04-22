public class Q125_Valid_Palindrome {
    public static StringBuilder removeSymbols(String s ){
        s = s.toUpperCase();
        char[] sInChar = s.toCharArray();

//      removing non alphanumeric characters
        StringBuilder newS = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            int asc = (int) sInChar[i];
            if ( (asc >= 48 && asc <= 57) || (asc >= 65 && asc<=90) ){
                newS.append(sInChar[i]);
            }
        }
        return newS;
    }

    public static boolean isPalindrome(String s) {

        StringBuilder newS = removeSymbols(s);
        int len = newS.length()-1;
        boolean isPal = true;

        for (int i = 0; i<newS.length()/2; i++){
            if (newS.charAt(i) != newS.charAt(len)){
                isPal = false;
                break;
            }
            len--;
        }

        return isPal;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("KARAK"));


    }

}
