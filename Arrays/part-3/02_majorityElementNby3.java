import java.util.*;


public class Solution {
    public static List< Integer > majorityElement(int []v) {
        // Write your code here
        int cnt1 = 0,cnt2=0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i = 0; i<v.length; i++){
            if(cnt1==0 && v[i]!=el2){
                el1 = v[i];
                cnt1=1;
            }
           else if(cnt2==0 && v[i]!=el1){
                el2 = v[i];
                cnt2=1;
            }
            else if (v[i]==el1){
                 cnt1++;
            }else if (v[i]==el2){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
       
         List<Integer> ls = new ArrayList<>(); 

        cnt1 = 0;
        cnt2=0;
        for(int i = 0; i<v.length;i++){
            if(v[i]==el1)cnt1++;    
            if(v[i]==el2)cnt2++;

        }

         int mini = (int)(v.length / 3) + 1;
        if (cnt1 >= mini) ls.add(el1);
        if (cnt2 >= mini) ls.add(el2);

    return ls;
        
  }
}