/*The following Java program prints all the Armstrong numbers up to the specified limit. */
// package Java_Basic_programs.Armstrong_Number;

import java.util.*;
import java.lang.Math;

public class Example1 {
    public static boolean isArmstrong(int n) {
        int temp, digit = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            digit++;
            temp = temp / 10;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digit));
            temp = temp / 10;
        }
        if (n == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the limit to check the number is armstrong or not:");
        int num = sc.nextInt();
        System.out.println("Armstrong number up to " + num + " are: ");
        for (int i = 0; i < num; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
