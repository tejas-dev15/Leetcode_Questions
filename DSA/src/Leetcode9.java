public class Leetcode9 {
    public boolean isPalindrome(int x) {
        int original = x;

        if(x<0){
            return false;
        }
        int d =0;
        while(x !=0){

            d = d * 10;
            d += x % 10;
            x = x/10;

        }

        if(d==original){
            return true;
        }else{
            return false;
        }
    }
}
