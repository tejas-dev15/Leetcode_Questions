public class Leetcode283 {
    public void moveZeroes(int[] nums) {
        int[] addar = new int[nums.length];
        int count = 0;
        int m = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                count++;
            }
            else if(nums[i]!= 0) {
                addar[m] = nums[i];
                m++;
            }
        }
        for(int j=0; j<count; j++){
            addar[m] = 0;
            if( m+1 <= nums.length -1){
                m++;
            }
        }
        for(int k=0; k<nums.length ; k++){
            nums[k] = addar[k];
        }
    }
}
