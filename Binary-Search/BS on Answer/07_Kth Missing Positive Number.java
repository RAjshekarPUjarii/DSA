public class Solution {
    public static int missingK(int[] vec, int n, int k) {
        // Write your code here.
       
        // for (int i = 0; i < vec.length; i++) {
        //  if(vec[i]<=k){
        //       k++;
        //  }   else{
        //      break;
        //  }
        // }
        // return k;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            int missing_number = vec[mid]-(mid+1);
            if(missing_number<k){
                low = mid+1;
            }else{
                high = mid - 1; 
            }
        }



         return k + high +1;
    }
}