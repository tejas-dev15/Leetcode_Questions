public class Leetcode540 {

        public int singleNonDuplicate(int[] nums) {

            if(nums.length == 1){
                return nums[0];
            }

            int left = 0;
            int right = nums.length -1;
            int mid = left + (right - left)/2;

            if(nums[mid] != nums[mid +1] && nums[mid] != nums[mid -1]){
                return nums[mid];
            }

            while(left < right){
                mid = left + (right - left)/2;


                if(mid == nums.length -1){
                    return nums[mid];
                }
                if(mid % 2==0){
                    if(nums[mid] == nums[mid+1]){
                        left = mid + 1;
                    }else{
                        right = mid -1;
                    }
                }
                else{
                    if(nums[mid]== nums[mid -1]){
                        left = mid + 1;
                    }else{
                        right = mid -1;
                    }
                }


            }
            return nums[left];
        }
    }

