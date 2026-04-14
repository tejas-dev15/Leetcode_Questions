package String;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[] window = new int[128];
        int[] need = new int[128];
        int left=0;



        if(m > n){
            return "";
        }

        int needCount =0;
        for(int i=0; i< m; i++){
            if(need[t.charAt(i)]==0){
                needCount++;
            }
            need[t.charAt(i)]++;
        }

        int have =0;
        int min_Len = Integer.MAX_VALUE;
        int StartIndex =0;

        for(int i=0; i<n; i++){
            char c = s.charAt(i);

            window[c]++;

            if(need[c] >0 &&  window[c] == need[c]){
                have++;
            }

            while(have == needCount){

                if(i-left+1 < min_Len){
                    min_Len = i-left+1;
                    StartIndex = left;
                }

                char LeftChar = s.charAt(left);
                window[LeftChar]--;

                if(need[LeftChar] > 0 && window[LeftChar] < need[LeftChar]){
                    have--;
                }

                left++;
            }

        }
        if(min_Len == Integer.MAX_VALUE) return "";
        return s.substring(StartIndex, StartIndex + min_Len);
    }
}
