package Java_Basic_programs.PrimeNumbers;

import java.util.*;

public class PrimeUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check:");
        int num = sc.nextInt();
        int flag = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(num + " is prime number.");
        } else {
            System.out.println(num + " is not prime.");
        }
        sc.close();
    }
}
