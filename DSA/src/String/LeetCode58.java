package String;

public class LeetCode58 {
    public int lengthOfLastWord(String s) {

        int count = 0;
        int n = s.length();
        int i = 0;
        for(int j = n-1; j>=0; j--){
            char c = s.charAt(j);

            if(c != ' ' ){
                i = j;
                break;
            }else{
                continue;
            }
        }

        for( int k =i ; k >= 0 ; k--){
            char c = s.charAt(k);

            if(c == ' '){
                break;
            }else{
                count++;
            }
        }
        return count;
    }
}
