public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
         int n  = a.length;
         long SN = (n*(n+1))/2;
         long S2N = (n*(n+1) * (2*n + 1))/6;

         long s1 = 0;
         long s2 = 0;
         
        for (int i = 0; i < a.length; i++) {
            s1 +=a[i];
            s2 += (long)a[i] * (long)a[i];
        }
          
        //S-Sn = X-Y:
        long val1 = s1 - SN;
          // S2-S2n = X^2-Y^2:
        long val2 = s2 - S2N;

      //Find X+Y = (X^2-Y^2)/(X-Y):
        val2 = val2 / val1;

        //Find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
        // Here, X-Y = val1 and X+Y = val2:
        long x = (val1 + val2) / 2;
        long y = x - val1;


         
         return new int[]{(int)x,(int)y};
    }
}