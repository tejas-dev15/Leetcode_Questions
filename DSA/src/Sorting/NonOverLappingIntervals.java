package Sorting;

import java.util.Arrays;

public class NonOverLappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b)-> a[0]-b[0]);
        int count = 0;
        int j= 0;
        int[] prev = intervals[0];
        for(int i=1; i<intervals.length; i++){


            int[] curr = intervals[i];

            if(curr[0] < prev[1]){
                count++;
                prev[1] = Math.min(prev[1], curr[1]);
            }else{
                prev =intervals[i];

            }
        }
        return count;
    }
}
