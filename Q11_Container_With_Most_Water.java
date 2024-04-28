public class Q11_Container_With_Most_Water {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxVolume = 0;
        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int volume = minHeight * width;
            maxVolume = Math.max(maxVolume, volume);

            while (height[left] <= minHeight && left < right) {
                left++;
            }
            while (height[right] <= minHeight && left < right) {
                right--;
            }
        }

        return maxVolume;
    }

}
