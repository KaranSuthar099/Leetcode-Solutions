public class Q852_Peak_Index_in_a_Mountain_Array {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while ( start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] < arr[middle+1] ){
                start = middle +1;
            } else if (arr[middle] > arr[middle+1])
                end = middle -1;
        }
        return start;
    }
}
