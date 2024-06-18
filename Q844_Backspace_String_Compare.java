public class Q844_Backspace_String_Compare {

    public boolean backspaceCompare(String s, String t) {
        int iterator1 = s.length()-1;
        int iterator2 = t.length()-1;

        int skip1 = 0;
        int skip2 = 0;

        while (iterator1 >= 0 || iterator2 >= 0){
            char chS = 'S';
            char chT = 'S';

            if (iterator1 >= 0) chS = s.charAt(iterator1);
            if (iterator2 >= 0) chT = t.charAt(iterator2);

            if ( chS == '#'){
                skip1++;
                iterator1 --;
                continue;
            }
            if (chT == '#'){
                skip2++;
                iterator2--;
                continue;
            }

            if (skip1 > 0){
                iterator1--;
                skip1--;
                continue;
            }
            if ( skip2 > 0) {
                iterator2--;
                skip2--;
                continue;
            }

            if (chS == chT){
                iterator1--;
                iterator2--;
            } else return false;

        }

        return true;

    }

}
