package BinarySearch;

public class Leetcode875 {
    public int minEatingSpeed(int[] piles, int h) {
        int b = 0;

        for(int i=0; i<piles.length; i++){
            if(piles[i] >= b){
                b = piles[i];
            }
        }


        int left = 1;
        int right = b;
        int mid = left + (right - left)/2;
        while(left < right){
            int hr = 0;
            mid = left + (right- left)/2;

            for(int n = 0; n < piles.length; n++){
                hr += Math.ceil((double)piles[n] / mid);
            }
            if ( hr > h){
                left = mid +1;
            }
            else if(hr <= h){
                right = mid;
            }

        }


        return left ;

    }

}
