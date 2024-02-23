import java.util.ArrayList;
public class Solution {
    public static int[] alternateNumbers(int []a) {
        
        
         int n = a.length;
         int arr[] =new int[n];
         int posIndex =0;
         int negIndex = 1;
         for(int i = 0;i <n;i++){
           if(a[i]>0){
             arr[posIndex]=a[i];
             posIndex+=2;
           }else{
            arr[negIndex]=a[i];
            negIndex+=2;
           }
         }

 
  return arr;
    }
}