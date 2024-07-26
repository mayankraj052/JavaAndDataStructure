package Method_example;

import java.util.*;

public class Sum {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        int x = sum1(8, 8);
        System.out.println("sum = " + x);
    }

    static int sum1(int a, int b) {
        return a + b;
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        System.out.println("sum of " + n1 + " and " + n2 + " is " + sum);
        sc.close();
    }
}
/*
 * /**
 * 
 * return_type name(arguments){
 * //body
 * return statement;
 * }
 * 
 * }
 */
