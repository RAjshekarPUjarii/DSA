import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        // Write your code here.    
      int n = arr.length;
      HashMap<Integer,Integer> map = new HashMap<>();
      int preSum = 0;
      int count =0;

      map.put(0,1);

      for(int i =0; i<n;i++ ){
          preSum += arr[i];

            int remove = preSum - k;

            
            count += map.getOrDefault(remove, 0);

          
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
      }
      return count;
    }
}