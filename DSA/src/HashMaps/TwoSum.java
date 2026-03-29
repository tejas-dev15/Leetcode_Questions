package HashMaps;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[]= new int[2];
        int n = nums.length;
        for(int i=0; i< n; i++){

            int num = nums[i];

            int need = target - num;

            if(map.containsKey(need)){
                int si = map.get(need);
                arr[0] = i;
                arr[1] = si;
                return arr;
            }
            map.put(num, i);
        }
        return arr;
    }
}
