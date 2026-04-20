package Array;

public class Leetcode1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        int digitcount = 0;
        for(int i =0; i<nums.length; i++){
            digitcount = 0;
            while(nums[i]>0){
                nums[i] =nums[i]/ 10;
                digitcount ++;
            }
            if(digitcount % 2 ==0){
                count++;
            }
        }
        return count;
    }
}
