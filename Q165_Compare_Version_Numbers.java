public class Q165_Compare_Version_Numbers {
    public static void main(String[] args) {
        System.out.println(compareVersion("0.1", "1.0"));

    }

    public static int compareVersion(String version1, String version2) {
        String[] versionArray1 = version1.split("\\.");
        String[] versionArray2 = version2.split("\\.");

        int iterator1 = 0;
        int iterator2 = 0;
        while (iterator1 != versionArray1.length || iterator2 != versionArray2.length) {
            // if the iterator are not equal to the lengths
            if ( iterator1 < versionArray1.length && iterator2 < versionArray2.length){
                int v1 = Integer.parseInt(versionArray1[iterator1]);
                int v2 = Integer.parseInt(versionArray2[iterator2]);

                // compare the strings
                if (v1 > v2) return 1;
                else if (v1 < v2) return -1;

                iterator1++;
                iterator2++;

            } else if ( iterator1 == versionArray1.length){
                // search out the remaining other array
                int v2 = Integer.parseInt(versionArray2[iterator2++]);
                if ( v2 != 0) return -1;

            } else if ( iterator2 == versionArray2.length){
                // search out the remaining other array
                int v1 = Integer.parseInt(versionArray1[iterator1++]);
                if ( v1 != 0) return 1;
            }

        }
        return 0;
    }


}
