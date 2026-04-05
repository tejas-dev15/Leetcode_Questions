package Stacks;

import java.util.Stack;

public class NextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {

        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        int n =nums.length;

        for(int i=0; i< 2*n; i++){
            int j = i%n;

            while(!stack.isEmpty() && nums[stack.peek()] < nums[j]){
                ans[stack.pop()] = nums[j];
            }
            if(i<n){
                stack.push(j);
            }
        }
        while(!stack.isEmpty()){
            int k = stack.pop();
            ans[k] = -1;
        }
        return ans;
    }
}
