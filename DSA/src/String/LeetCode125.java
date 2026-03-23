package String;

public class LeetCode125 {

    public boolean isPalindrome(String s) {
        int n = s.length();
        int left = 0;
        int right = n-1;

        while(left < right){

            while(left < right  && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right  && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            char l = Character.toLowerCase(s.charAt(left));
            char r = Character.toLowerCase(s.charAt(right));

            if(l != r){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
