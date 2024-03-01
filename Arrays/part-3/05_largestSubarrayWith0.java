import java.util.HashMap;

public class Solution {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.

        // Kadane's Algorithm,
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxi =0;
        int sum = 0;
        for(int i =0; i<arr.length;i++){
            sum+=arr[i];
            if(sum == 0){
                maxi = i+1;
            }else {
                if(map.get(sum)!=null){
                 maxi = Math.max(maxi, i-map.get(sum));
                }else{
                    map.put(sum,i);
                }
            }
        }
        return maxi;
    }
}