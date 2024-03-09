public class checkSetorNot {
    public static boolean check(int  n , int i){
        int count = 0;
        while(n>0){
            if(count==i){
                if((n&1)==1){
                    return true;
                }else{
                    return false;
                }
            }
         n = n>>1;
         count++;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(check(13,2));
    }
}
