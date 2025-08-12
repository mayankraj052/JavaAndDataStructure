//factorial of 5 number.
// package Control_Statement;

import java.util.Scanner;

public class JavaForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for which yoou want to find a factorial:");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of " + num + " is " + fact);
        sc.close();
    }
}
