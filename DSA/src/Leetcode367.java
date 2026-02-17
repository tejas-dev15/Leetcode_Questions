public class Leetcode367 {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        int mid = left + (right -left)/2;
        if(num==1){
            return true;
        }
        while( left <= right){
            mid = left + (right - left)/ 2;
            if(mid  > num/ mid){
                right = mid - 1 ;
            }
            else if( mid < num/mid){
                left = mid + 1;
            }
            else{
                if(num % mid == 0){
                    return  true;
                }else{
                    left = mid + 1;
                }
            }
        }
        return false;
    }
}
