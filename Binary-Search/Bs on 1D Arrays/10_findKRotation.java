class Solution {
    public static int findKRotation(int []arr){
        // Write your code here.
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = 0;
        while (low <= high) {
            int mid = (low + high) / 2;

           
            if (arr[low] <= arr[mid]) {
                
                
                   if(arr[low]<ans){
                       index=low;
                       ans = arr[low];
                   }

                
                low = mid + 1;

            } else { 
                if(arr[mid]<ans){
                    index = mid;
                    ans =arr[mid];
                }

              
                high = mid - 1;
            }
        }
        return index;
    }
}