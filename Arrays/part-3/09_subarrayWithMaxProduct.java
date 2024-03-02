public class Solution {
    public static int subarrayWithMaxProduct(int []nums){
        // Write your code here.
     
      int pref = 1;
        int suf = 1;
        int max = Integer.MIN_VALUE;
        

        for(int i = 0 ;i <nums.length;i++){

            if(pref == 0)pref=1;
              if(suf == 0)suf=1;

            pref *= nums[i];
            suf *= nums[nums.length-i-1];
            max = Math.max(max,Math.max(pref,suf));
        }
        return max;
                 }

}