// package Java_Basic_programs;

import java.util.*;

public class Factorial {
    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find factorial:");
        int term = sc.nextInt();
        int fact = factorial(term);
        System.out.println("factorial of " + term + " is " + fact);
        sc.close();
    }
}
