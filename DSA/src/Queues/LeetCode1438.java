package Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode1438 {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();
        int max =0;
        int left =0;

        for(int i=0; i<nums.length; i++){

            while(!maxDeque.isEmpty() && nums[i] > nums[maxDeque.peekLast()]){
                maxDeque.pollLast();
            }
            maxDeque.addLast(i);

            while(!minDeque.isEmpty() && nums[i] < nums[minDeque.peekLast()]){
                minDeque.pollLast();
            }
            minDeque.addLast(i);

            while(Math.abs(nums[maxDeque.peekFirst()] -
                    nums[minDeque.peekFirst()]) > limit){

                if(maxDeque.peekFirst()==left){
                    maxDeque.pollFirst();
                }
                if(minDeque.peekFirst()==left){
                    minDeque.pollFirst();
                }
                left++;
            }
            max = Math.max(max, i-left +1);
        }
        return max;
    }
}
