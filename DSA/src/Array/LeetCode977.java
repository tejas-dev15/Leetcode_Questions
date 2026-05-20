package Array;

public class LeetCode977 {

        public int[] sortedSquares(int[] nums) {

            int l = 0;
            int r = nums.length-1;
            int p = nums.length-1;
            int[] arr = new int[nums.length];

            while(p>-1){
                int lv = nums[l] * nums[l];
                int rv = nums[r] * nums[r];

                if(lv >= rv){
                    arr[p--] = lv;
                    l++;

                }else{
                    arr[p--] = rv;
                    r--;
                }
            }

            return arr;
        }
}