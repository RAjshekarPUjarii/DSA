import java.util.* ;
import java.io.*; 

public class Solution {

  public static int findFloor(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
          
            if (arr[mid] <= x) {
                ans = arr[mid];
               
                low = mid + 1;
            } else {
                high = mid - 1; 
        }
        
    }
    return ans;
  }

    public static int findCeil(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] >= x) {
                ans = arr[mid];
               
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }
        return ans;
    }

    public static int[] getFloorAndCeil(int[] arr, int n, int x) {
      // Wriute your code here.
      
       int f = findFloor(arr, n, x);
        int c = findCeil(arr, n, x);
        return new int[] {f, c};
    }
    

}