public class Solution {
    public static boolean possible(int[] bloomDay, int day,int m, int k ){
       
       int noOfBuk = 0;
       int count = 0;
       for(int i = 0;  i<bloomDay.length;i++){
           
           if(bloomDay[i]<=day){
             count++;
           }
           else{
              noOfBuk += (count/k);
               count =0;
           }
           
   
       }
        noOfBuk += (count/k);
       return noOfBuk >=m;
}
   public static int roseGarden(int[] bloomDay, int k, int m) {
       // Write your code here.
        long val = (long) m * k;
    int n = bloomDay.length; 
   if (val > n) return -1;

    int mini = Integer.MAX_VALUE;
    int maxi = Integer.MIN_VALUE;

       for(int i = 0; i<bloomDay.length; i++){
           maxi=Math.max(maxi,bloomDay[i]);                            
           mini=Math.min(mini,bloomDay[i]);
       }
   
   int low =mini;
    int high = maxi;
    while(low<=high){

    int mid = (low + high) / 2;
      if(possible(bloomDay,mid,m,k)){
          high = mid - 1;
      }else{
          low = mid + 1;
      }

    }

  return low;

   }
}