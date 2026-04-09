package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class RNP {
    public int evalRPN(String[] tokens) {
        int a =0;
        int b=0;


        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0; i<tokens.length; i++){
            String token = tokens[i];

            switch(token){
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    b = stack.pop();
                    a = stack.pop();

                    stack.push(a - b);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    b = stack.pop();
                    a = stack.pop();

                    stack.push(a /b);
                    break;

                default :
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
