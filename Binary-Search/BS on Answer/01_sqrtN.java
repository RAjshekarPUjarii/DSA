import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		
       long low = 1;
	    long  high = N;
		
		while(low<=high){
			long mid =  low  + (high-low)/2;
			if((mid * mid) <= N){
				
				low = mid+1;
			}
			else{
				high = mid-1;
			}
		}

		//  return  (int)Math.sqrt(N);
		return  (int)high;
	}
}