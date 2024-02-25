import java.util.HashSet;

import javax.swing.LookAndFeel;
import java.util.*;
public class Solution {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        int n = a.length;
        int longestSequence=1;
        if(n==0)return 0;

        HashSet<Integer>set = new HashSet<>();
        for(int i =0; i<n;i++){
            set.add(a[i]);
        }
        for (int it : set) {
            if(!set.contains(it-1)){
                int  countSequence = 1;
                 int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    countSequence = countSequence + 1;
                }
                longestSequence = Math.max(longestSequence, countSequence);
            }
        }
        return longestSequence;
    }
}