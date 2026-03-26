package String;

import java.util.Arrays;

public class LeetCode242 {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String str1 = new String(arr1);
        String str2 = new String(arr2);

        if (str1.length() != str2.length()) return false;

        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }

    }
}