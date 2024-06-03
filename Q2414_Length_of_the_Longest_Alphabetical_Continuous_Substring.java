public class Q2414_Length_of_the_Longest_Alphabetical_Continuous_Substring {

    public static int longestContinuousSubstring(String s) {
        int maxSequence = 1;
        int currentSequence = 1;

        char[] sArray = s.toCharArray();

        for (int i = 1; i<sArray.length; i++){
            if ( sArray[i-1] +1 == sArray[i]){
                currentSequence++;
            } else currentSequence = 1;

            if (currentSequence > maxSequence) maxSequence++;
        }

        return maxSequence;
    }

}
