public class Q443_String_Compression {
    public static int compress(char[] chars) {
        // we have to only store frequencies greater than 1
        char character = chars[0];
        int frequency = 0;
        int index = 0;
        String[] str = new String[50];

        for (char i : chars) {
            // either the character can be equal to i or be different form it
            if (i == character) frequency++;
            else {
                chars[index++] = character;
                // storing the frequency accordingly (12 can be stored an ['1', 2'])
                if (frequency > 1) {
                    for (char c : String.valueOf(frequency).toCharArray())
                        chars[index++] = c;
                }
//                chars[index++] = (char) (frequency + 48);
                character = i;
                frequency = 1;
            }
        }
        chars[index++] = character;
        // for storing the frequency even if in multiple digits
        if (frequency > 1) {
            for (char c : String.valueOf(frequency).toCharArray())
                chars[index++] = c;
        }
        return index;
    }
}
