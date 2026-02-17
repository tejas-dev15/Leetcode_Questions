public class Leetcode334 {
    public boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(first >= nums[i]){
                first =nums[i];
            }
            else if(nums[i] <= second){
                second = nums[i];
            }
            else if(nums[i] > second){
                return true;
            }

        }
        return false;
    }
}
