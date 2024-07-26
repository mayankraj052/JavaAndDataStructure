/*Let’s create another Java program that checks if the given number is an Armstrong number or not. */
package Java_Basic_programs.Armstrong_Number;

import java.util.*;

public class Example2 {

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
        System.out.print("enter the number to check the number is armstrong or not:");
        int num = sc.nextInt();
        System.out.println("Armstrong number up to " + num + " are: ");
        if (isArmstrong(num)) {
            System.out.println(num + " is Armstrong Number");
        } else {
            System.out.println(num + " is not Armstrong Number");
        }

        sc.close();
    }
}
