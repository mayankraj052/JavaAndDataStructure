package bit_manipulation;

public class PowerofTwoorNot {
    public static boolean isPoerofTwo(int n){
        return (n&(n-1)) ==0;
    }
    public static void main(String[] args) {
        System.out.println(isPoerofTwo(5));
    }
}
