import java.util.*;

public class Solution 

{
     public static int countPainters(ArrayList<Integer> boards, int time) {
        int n = boards.size(); // size of array.
        int painters = 1;
        long boardsPainter = 0;
        for (int i = 0; i < n; i++) {
            if (boardsPainter + boards.get(i) <= time) {
                
                boardsPainter += boards.get(i);
            } else {
             
                painters++;
                boardsPainter = boards.get(i);
            }
        }
        return painters;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int low = Collections.max(boards);
        int high = boards.stream().mapToInt(Integer::intValue).sum();

    
        while (low <= high) {
            int mid = (low + high) / 2;
            int painters = countPainters(boards, mid);
            if (painters > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;

//  below programs are same..... n code		
// Book Allocation Problem		
// Split array - Largest Sum		

// Painter's partition
    }
}