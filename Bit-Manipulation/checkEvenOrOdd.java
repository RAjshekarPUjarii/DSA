public class checkEvenOrOdd {
    public static String oddEven(int N){
        // Write your code here.

        if((N&1)==1){
            return "odd";
        }
        return "even";
    }
    public static void main(String[] args) {
        System.out.println(oddEven(10));
    }
}
