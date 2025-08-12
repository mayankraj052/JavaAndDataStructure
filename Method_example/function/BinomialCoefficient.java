// package Method_example.function;

public class BinomialCoefficient {
    public static void main(String[] args) {
        System.out.println("factorial= " + binomial(5, 2));
    }

    static int binomial(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n - r);
        int ans = n_fact / (r_fact * n_r_fact);
        return ans;
    }

    static int factorial(int n) {
        int fact = 1;
        while (n != 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
