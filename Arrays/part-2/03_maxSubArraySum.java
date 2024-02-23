import java.util.* ;
import java.io.*; 
// Kadane’s Algorithm

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		
    //    Kadane’s Algorithm

		long maxi = Long.MIN_VALUE;
		long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
		if (maxi < 0) maxi = 0;

        

        return maxi;
	}


}
