// package bit_manipulation;

public class FastExpo {
    public static int calcPower(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public class FastExponentiation {
        public static long fastExpo(long a, long b) {
            if (b == 0)
                return 1; // Base case: a^0 = 1
            long half = fastExpo(a, b / 2);
            if (b % 2 == 0)
                return half * half; // If even, a^b = (a^(b/2))²
            else
                return half * half * a; // If odd, a^b = (a^(b/2))² * a
        }

        public static void main(String[] args) {
            System.out.println(fastExpo(2, 10)); // Output: 1024
        }
    }

    public static long modExpo(long a, long b, long m) {
        long res = 1;
        a %= m; // Reduce 'a' under mod m

        while (b > 0) {
            if ((b & 1) == 1) { // If exponent is odd
                res = (res * a) % m;
            }
            a = (a * a) % m; // Square base
            b >>= 1; // Reduce exponent
        }
        return res;
    }

    public static void main(String[] args) {
        int m = Integer.MAX_VALUE;
        System.out.println(calcPower(5, 3));
        System.out.println(modExpo(5, 3, m));
    }

}
