import java.util.* ;
import java.io.*; 
public class Solution {
     public static int findDays(int weights[], int cap){
     int load = 0;
     int days =1;
     for(int i =0;i<weights.length; i++){

         if(weights[i] + load >cap){
             days =days +1;
             load = weights[i];
         }else{
             load += weights[i];
         }
    
     }
          return days;
 }
    public static int leastWeightCapacity(int[] weights, int days) {
        // Write your code here.
           
     int sum = 0;
     int maxi = Integer.MIN_VALUE;
     for(int i =0; i<weights.length; i++){
           sum += weights[i];
         maxi = Math.max(maxi,weights[i]);
     }
    int low = maxi;
    int high = sum;
    while(low<=high){
        int mid = (low + high)/2;
        if(findDays(weights,mid)<=days){
              high = mid -1;
        }else{
            low  =  mid+1;
        }
    }
     
return low;
    }
}