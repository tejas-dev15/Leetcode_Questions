package String;

public class Leetcode13 {
    public int romanToInt(String s) {

        int total =0;
        int currVal = 0;
        int nextVal =0;
        for(int i=0; i< s.length(); i++){
            currVal =0;
            nextVal =0;
            char curr = s.charAt(i);

            if(curr== 'I') currVal = 1;
            else if(curr == 'V') currVal =5;
            else if(curr == 'X') currVal =10;
            else if(curr== 'L') currVal = 50;
            else if(curr== 'C') currVal = 100;
            else if(curr== 'D') currVal = 500;
            else if(curr== 'M') currVal = 1000;

            if(i< s.length() -1) {
                char next  = s.charAt(i+1);

                if(next== 'I')  nextVal = 1;
                else if(next== 'V') nextVal =5;
                else if(next== 'X') nextVal =10;
                else if(next== 'L') nextVal = 50;
                else if(next== 'C') nextVal = 100;
                else if(next== 'D') nextVal = 500;
                else if(next== 'M') nextVal = 1000;

            }

            if(currVal >= nextVal){
                total += currVal;
            }else if(currVal < nextVal){
                total -= currVal;
            }

        }
        return total;
    }
}

