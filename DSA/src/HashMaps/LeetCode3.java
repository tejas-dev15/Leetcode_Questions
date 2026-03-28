package HashMaps;

import java.util.HashSet;

public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int maxLength =0;
        HashSet<Character> set = new HashSet<>();

        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);

            if(set.contains(c)){
                while(set.contains(c)){
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            set.add(c);
            maxLength = Math.max(maxLength, right - left +1 );
        }
        return maxLength;
    }
}
