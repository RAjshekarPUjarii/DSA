import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void .java []a, long []b){
        // Write your code here.

          int left = a.length-1;
          int right = 0;
          while(left>=0 &&  right<=b.length){
              if(a[left]>b[right]){
                  long temp = a[left];
                  a[left]=b[right];
                  b[right]=temp;
                  left--;
                right++;
              }else{
                  break;
              }
          }
         Arrays.sort(a);
         Arrays.sort(b);
    }
}