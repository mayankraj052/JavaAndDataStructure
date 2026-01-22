package DsaFundamental;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < 10; i++) {
            int sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
        System.out.println("next");
        for (int i = 0; i < 10; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
