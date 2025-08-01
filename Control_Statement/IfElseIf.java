package Control_Statement;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check it positive, negative or zero :");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println(num + " is negative number");
        } else if (num == 0) {
            System.out.println(num + " is Zero");
        } else {
            System.out.println(num + " is positive number");
        }
        sc.close();
    }
}
