package Method_example;

import java.util.*;

//import java.math.*;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // boolean x = isArmStrong(n);
        // System.out.println(x);
        for (int i = 1; i < n; i++) {
            if (isArmStrong(i)) {
                System.out.println(i + " ");
            }
        }
        boolean ans = isPrime(n);
        System.out.println(ans);
        sc.close();
    }

    static boolean isArmStrong(int n) {
        int orig = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        if (sum == orig) {
            return true;
        }
        return false;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
