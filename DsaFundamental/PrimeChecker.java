package DsaFundamental;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        System.out.print("enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(num + "  is prime " + isPrime);

    }
}
