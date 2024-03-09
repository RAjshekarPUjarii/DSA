
public class toBinary {
    public static String toBinarys(int n) {
        String s = "";
        while (n > 0) {
            s = (n % 2) + s;
            n = n / 2;
        }
        return s;
    }
    
    public static void main(String[] args) {
        System.out.println(toBinarys(9));
    }
}
