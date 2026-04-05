package Stacks;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums2.length; i++){
            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                int k = stack.pop();
                map.put(k, nums2[i]);
            }

            stack.push(nums2[i]);
        }

        while(!stack.isEmpty()){
            int p = stack.pop();
            map.put(p, -1);
        }

        for(int i=0; i< nums1.length; i++){

            ans[i] = map.get(nums1[i]);

        }

        return ans;
    }
}
