package Stacks;


import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] answer = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();


        for(int i=0; i< temperatures.length; i++){

            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i] ){

                int k = stack.pop();
                answer[k] = i-k;
            }
            stack.push(i);
        }

        return answer;
    }
}
