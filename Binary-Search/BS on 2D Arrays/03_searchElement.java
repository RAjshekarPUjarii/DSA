import java.util.*;
public class Solution {
    public static boolean searchElement(int [][]matrix, int target) {
        // Write your code here.

       int n = matrix.length;
    int m = matrix[0].length;
    int row = 0, col = m - 1;

 
    while (row < n && col >= 0) {
        if (matrix[row][col] == target) return true;
        else if (matrix[row][col] < target) row++;
        else col--;
    }
    return false;
    }
}