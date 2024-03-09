public class toDecimal {


    public static int toDecimals(String s){
        int num = 0;
        int p2=1;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='1'){
                num += p2;
            }
            p2 *= 2;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(toDecimals("1010"));
    }
}
