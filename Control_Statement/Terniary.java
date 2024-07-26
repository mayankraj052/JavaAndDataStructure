package Control_Statement;

import java.util.*;

public class Terniary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check: ");
        int num = sc.nextInt();
        String output = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + output + " number");
        sc.close();
    }
}
