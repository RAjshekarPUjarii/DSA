import java.util.*;

public class Solution {
    public static int[] spiralMatrix(int[][] mat) {
        int n = mat.length; 
        int m = mat[0].length; 
        int ans[] = new int[n * m];

        
        int top = 0, left = 0, bottom = n - 1, right = m - 1;
        int index = 0;
        while (top <= bottom && left <= right) {

            
            for (int i = left; i <= right; i++) {
                ans[index++] = mat[top][i];
            }
            top++;

          
            for (int i = top; i <= bottom; i++) {
                ans[index++] = mat[i][right];
            }

            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans[index++] = mat[bottom][i];
                }
                bottom--;
            }

            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[index++] = mat[i][left];
                } 
                left++;
            }
        }
        return ans;
    }
}

