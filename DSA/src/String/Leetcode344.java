package String;

public class Leetcode344 {
    public void reverseString(char[] s) {
        int n = s.length;

        char a = ' ';
        char b = ' ';
        for(int i=0; i < n/2; i++){
            int j = i+1;

            a = s[i];
            b = s[s.length-j];

            char temp= ' ';

            temp =  a;
            a = b;
            b = temp;

            s[i] = a;
            s[s.length-j] = b;
        }

    }
}
