public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int index = 0;
        for(int i = 1; i<n; i++){
            if(arr[i]!=arr[i-1]){
                arr[index]=arr[i];
                index++;
            }
        }
        return index+1;
    }
}