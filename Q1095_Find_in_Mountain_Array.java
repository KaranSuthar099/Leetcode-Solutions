import java.util.Arrays;

public class Q1095_Find_in_Mountain_Array {

    public static void main(String[] args) {
        int[] mountain = {1,2,3,5,3};
        MountainArray array = new MountainArray(mountain);
        System.out.println(findInMountainArray( 0, array));


    }

    private static class MountainArray {
        int[] array;

        MountainArray(int[] array) {
            this.array = array;
        }

        public int get(int index) {
            return array[index];
        }

        public int length() {
            return array.length;
        }

        @Override
        public String toString() {
            return Arrays.toString(array);
        }
    }

    public static int binarySearch(MountainArray nums, int target, int start, int end, boolean isAscending) {
        while (start <= end) {
            int middle = start + (end - start) / 2;
            int middleElement = nums.get(middle);
            if (middleElement > target) {
                if (isAscending) end = middle - 1;
                else start = middle +1;
            } else if (middleElement < target) {
                if (isAscending) start = middle +1;
                else end = middle - 1;
            } else return middle;
        }
        return -1;
    }

    public static int findPeak(MountainArray nums) {
        int start = 0;
        int end = nums.length()-1;

        while (start < end) {
            int middle = start + (end - start) / 2;
            int middleElement = nums.get(middle);
            int nextMiddleElement = nums.get(middle + 1);

            if (middleElement > nextMiddleElement) {
                end = middle;
            } else start = middle + 1;
        }
        return start;
    }

    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int retIndex = binarySearch(mountainArr, target, 0, peak, true);

        if (retIndex == -1) {
            retIndex = binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
        }
        return retIndex;
    }
}
