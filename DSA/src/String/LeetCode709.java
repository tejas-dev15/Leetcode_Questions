package String;

public class LeetCode709 {
    public String toLowerCase(String s) {

        int n = s.length();
        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i< sb.length(); i++){
            char c = s.charAt(i);

            if(Character.isUpperCase(c)){
                sb.setCharAt(i, Character.toLowerCase(c));
            }else{
                continue;
            }
        }
        s = sb.toString();
        return s;
    }
}
