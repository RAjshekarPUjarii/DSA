import java.util.*;
public class Solution {
    public static int subarraysWithSumK(int []arr, int k) {
        // Write your code here
        HashMap<Integer,Integer> map =  new HashMap<>();
        int xor = 0;
        map.put(0,1);
        int count = 0;

        for(int i = 0;i<arr.length;i++){
            xor = xor^arr[i];
            int x = xor ^ k;

            if(map.containsKey(x)){
                count += map.get(x);
            }

            if (map.containsKey(xor)) {
                map.put(xor, map.get(xor) + 1);
            } else {
                map.put(xor, 1);
            }
        }
       
     return count;
    }
}