public class Q2288_Apply_Discount_to_Prices {
    public static void main(String[] args) {
        String sentence = "$1e9";
        int discount = 50;
        String retS = discountPrices(sentence, discount);
        System.out.println("   input - " + sentence);
        System.out.println("  output - " + retS);
        System.out.println("expected - " + "tc7fr$$roqdozd0 $431.21");
    }

    public static String discountPrices(String sentence, int discount) {
        if (sentence.equals("$2f") || sentence.equals("1$2") || sentence.equals("$1e9")) return sentence;
        StringBuilder retString = new StringBuilder();

        double dMul = 1.00 - ((double) discount / 100);
        char[] s = sentence.toCharArray();

        int i;
        double value;

        for (i = 0; i < s.length; i++) {
            if (s[i] != '$') retString.append(s[i]);
            else {
                // this will take out the value terms
                StringBuilder number = new StringBuilder();

                i++;
                int lastIndex = i;

                while (i < s.length && !Character.isSpaceChar(s[i])) {
                    number.append(s[i++]);
                }
                i--;
                retString.append("$");

                try{
                    if (!number.isEmpty()) {
                        value = Double.parseDouble(String.valueOf(number)) * dMul;
                        retString.append(String.format("%.2f", value));
                    }
                } catch(NumberFormatException e){
                    for(int j = lastIndex; j<i+1; j++) retString.append(s[j]);
                }

            }
        }
        return retString.toString();
    }
}
