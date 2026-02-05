import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Leetcod1047 {

    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        char top = ' ';
        stack.push(s.charAt(0));
        for(int i = 1; i <s.length(); i++){
            if(!stack.isEmpty()){
                top = stack.peek();
            }
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else if(top == s.charAt(i)){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}