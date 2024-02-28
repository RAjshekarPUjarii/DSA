import java.util.*;
public class Solution {
     
     public static int[] generate(int row) {
        int[] ansRow = new int[row + 1];
        int ans = 1;
        ansRow[0] = 1;
        for (int col = 1; col <= row; col++) {
            ans = ans * (row - col + 1);
            ans = ans / col;
            ansRow[col] = ans;
        }
        return ansRow;
    }

    public static int[][] pascalTriangle(int n) {
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            ans[i] = generate(i);
    

            
        }

        return ans;
    }
}