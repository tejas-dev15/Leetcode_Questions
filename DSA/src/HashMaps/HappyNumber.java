package HashMaps;

import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum =0;
        int n1 =n;
        int digit = 0;
        while(sum!=1){

            sum =0;
            while(n1/10 !=0){
                digit  = n1 % 10;
                sum += digit * digit;
                n1 /=10;
            }
            digit = n1%10;
            sum += digit * digit;
            if(set.contains(sum)) return false;
            set.add(sum);
            n1 = sum;
        }
        return true;
    }
}
