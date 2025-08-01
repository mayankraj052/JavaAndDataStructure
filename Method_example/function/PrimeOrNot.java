package Method_example.function;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(n + " is prime " + isPrime(n));
    }

    // public static boolean isPrime(int n) {
    // // boolean isPrime = true;
    // //corner case
    // if(n==2 || n==3){
    // return true;
    // }
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }
    // more optimized way
    public static boolean isPrime(int n) {
        if (n == 2 || n == 3) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
// prime n is prime if only divide by 1,n