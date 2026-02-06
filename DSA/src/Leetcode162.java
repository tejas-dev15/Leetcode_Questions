public class Leetcode162 {
    public int findPeakElement(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int mid = 0;
        while(left < right){

            mid = left + (right - left)/2;
            if(mid == 0 ){
                if(nums[mid] > nums[mid +1]){
                    return mid;
                }
            }
            else if(mid == nums.length -1){
                if(nums[mid] > nums[mid -1]){
                    return mid;
                }
            }
            if(nums[mid]< nums[mid + 1]){
                left = mid +1;
            }
            else if(nums[mid] < nums[mid -1]){
                right = mid - 1;
            }
            else if(nums[mid] > nums[mid + 1]){
                if(nums[mid] > nums[mid - 1]){
                    return mid;
                }
            }
        }
        return left;
    }
}
