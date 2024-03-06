
public class Solution {

    public static int countPartitions(int a[],int maxSum){
          int n = a.length; 
        int partitions = 1;
        long subarraySum = 0;
        for (int i = 0; i < a.length; i++) {
            
            if(a[i] + subarraySum <= maxSum){
                 subarraySum += a[i];
            }else{
                partitions++;
                subarraySum = a[i];
            }
      
        }
              return partitions;
    }
    public static int largestSubarraySumMinimized(int []a, int k) {
        // Write Your Code Here

      int low = a[0];
        int high = 0;
 
        for (int i = 0; i < a.length; i++) {
            low = Math.max(low, a[i]);
            high += a[i];
        }


        while (low <= high) {
            int mid = (low + high) / 2;
            int partitions = countPartitions(a, mid);
            if (partitions > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}



