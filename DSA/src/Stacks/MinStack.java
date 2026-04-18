package Stacks;

import java.util.ArrayList;

public class MinStack {
    class MinStack {

        ArrayList<Integer> stack = new ArrayList<>();
        ArrayList<Integer> minStack = new ArrayList<>();
        int min = 0;

        public MinStack() {

        }

        public void push(int val) {
            stack.add(val);

            if(minStack.isEmpty()){
                minStack.add(val);
            }else{
                minStack.add(Math.min(val, minStack.get(minStack.size() -1 )));
            }
        }

        public void pop() {
            stack.remove(stack.size() -1);
            minStack.remove(minStack.size()-1);
        }

        public int top() {
            if(!stack.isEmpty()){
                return stack.get(stack.size() -1 );
            }else{
                return 0;
            }
        }

        public int getMin() {
            return minStack.get(minStack.size()-1);
        }
    }
}
