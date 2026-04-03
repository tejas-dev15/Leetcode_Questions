package Sorting;

import java.util.Arrays;

public class LargestNumber {
    public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        for(int i=0; i<nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a, b)-> (b+a).compareTo(a+b));

        StringBuilder sb = new StringBuilder();

        if(arr[0].equals("0")){
            return "0";
        }

        for(int j=0; j<arr.length; j++){
            sb.append(arr[j]);
        }
        return sb.toString();
    }
}
