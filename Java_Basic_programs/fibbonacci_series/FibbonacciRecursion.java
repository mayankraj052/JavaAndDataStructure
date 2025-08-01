package Java_Basic_programs.fibbonacci_series;

import java.util.*;

public class FibbonacciRecursion {
    public static int printFibbo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return printFibbo(n - 1) + printFibbo(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of term for fibbonacci series: ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print(printFibbo(i) + " ");
        }
        sc.close();
    }
}
