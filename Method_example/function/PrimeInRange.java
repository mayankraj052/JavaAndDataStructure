package Method_example.function;

public class PrimeInRange {
    public static void main(String[] args) {
        int n = 60;
        for (int i = 2; i <= n; i++) { // Start from 2, as 0 and 1 are not prime numbers
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false; // Numbers less than or equal to 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) { // Check up to the square root of n
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
