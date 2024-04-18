public class Q9_Palindrome_Number {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int org = x;
        int revNumber = 0;

        while (true) {
            revNumber += org % 10;
            org /= 10;
            if (org == 0)
                break;
            revNumber *= 10;
        }
        return x == revNumber;
    }
}
