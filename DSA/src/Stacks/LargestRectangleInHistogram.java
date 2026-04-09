package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {


        Deque<Integer> stack = new ArrayDeque<>();
        int left =0;
        int max = 0;

        for(int i=0 ; i<heights.length; i++){

            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                int k = stack.pop();
                if(stack.isEmpty()){
                    left=-1;
                }else{
                    left=stack.peek();
                }
                int width = i - left-1 ;
                int area = heights[k] * width;
                max = Math.max(max,area);
            }

            stack.push(i);
        }

        while(!stack.isEmpty()){
            int k= stack.pop();

            int right = heights.length;
            left = stack.isEmpty() ? -1: stack.peek();
            int width = right - left -1;
            int area = heights[k] * width;
            max = Math.max(max,area);
        }
        return max;
    }
}
