import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []arr) {
        // Write your code here.
       
ArrayList<Integer> ans= new ArrayList<>();
  
   int n=arr.length;
   int max = arr[n - 1];

    ans.add(arr[n-1]);
    
    
    for (int i = n - 2; i >= 0; i--)
      if (arr[i] > max) {
        ans.add(arr[i]);
        max = arr[i];
      }
      
    // Collections.sort(ans);

  return ans;

    }
}