import java.util.ArrayList;
public class Solution
{
    public static int lowerBound(ArrayList<Integer> arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
        
            if (arr.get(mid) >= x) {
                ans = mid;
               
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }
        return ans;
    }
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        //	  Write your code here.
        int cnt_max = 0;
        int index = -1;
          
         for (int i = 0; i < n; i++) {
           
            int cnt_ones = m - lowerBound(matrix.get(i), m, 1);
            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }
        return index;
    }
}