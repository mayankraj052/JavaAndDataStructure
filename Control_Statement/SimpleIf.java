// package Control_Statement;

import java.util.*;

public class SimpleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check it is even or not :");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "is even number");
        }
        sc.close();
    }
}
