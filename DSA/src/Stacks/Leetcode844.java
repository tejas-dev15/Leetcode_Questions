package Stacks;

import java.util.Stack;

public class Leetcode844 {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for( int i=0; i<s.length(); i++){
            stack.push(s.charAt(i));
            if(s.charAt(i)=='#'){
                stack.pop();
                if(!stack.isEmpty())
                    stack.pop();
            }
        }

        for(int j=0; j<t.length(); j++){
            stack2.push(t.charAt(j));
            if(t.charAt(j)=='#'){
                stack2.pop();
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
            }
        }
        if(stack.size() != stack2.size()){
            return false;
        }
        while(!stack.isEmpty() && !stack2.isEmpty()){
            char n = stack.pop();
            char k = stack2.pop();
            if(n!=k){
                return false;
            }
        }

        return true;
    }
}
