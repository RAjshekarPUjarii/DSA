
public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int largerElement = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>largerElement){
                largerElement = arr[i];
            }
        }
        return largerElement;

    }
}