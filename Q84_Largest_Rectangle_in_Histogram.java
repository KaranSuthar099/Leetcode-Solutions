import java.util.Stack;

public class Q84_Largest_Rectangle_in_Histogram {

    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{heights[0], 0});

        int iterator = 1;
        int maxArea = 0;
        while (iterator < heights.length){
            int peek = stack.peek()[0];
            int current = heights[iterator];

            if (peek > current){
                int correctIndex = -1;
                while (!stack.isEmpty() && stack.peek()[0] > current){
                    int[] currentElement = stack.pop();
                    correctIndex = currentElement[1];
                    int area = (iterator - currentElement[1]) * currentElement[0];
                    if (area > maxArea) maxArea = area;
                }
                stack.push(new int[]{current, correctIndex});

            } else if (peek < current){
                // add a new array
                stack.push(new int[]{current, iterator});
            }

            iterator++;
        }

        while (!stack.isEmpty()){
            int[] currentElement = stack.pop();
            int area = (iterator - currentElement[1]) * currentElement[0];
            if (area > maxArea) maxArea = area;
        }
        return maxArea;
    }


}
