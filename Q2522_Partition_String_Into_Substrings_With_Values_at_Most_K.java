public class Q2522_Partition_String_Into_Substrings_With_Values_at_Most_K {

    public static void main(String[] args) {
        String s = "1";
        System.out.println(minimumPartition(s, 1));
    }

    public static int minimumPartition(String s, int k) {
        int parts = 0;
        long part = 0;
        for (char c: s.toCharArray()){
            int current = (c - 48);

            if (current > k) return -1;
            if ( part * 10 +  current <= k){
                part = part*10 + current;
            } else {
                // the limit exceeds
                parts ++;
                part = current;
            }
        }
        if (part <= k) parts++;
        return parts;
    }

}
