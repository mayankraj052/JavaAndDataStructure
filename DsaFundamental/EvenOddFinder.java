package DsaFundamental;

import java.util.ArrayList;

public class EvenOddFinder {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList even = new ArrayList<>();
        ArrayList odd = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                even.add(number[i]);
            } else {
                odd.add(number[i]);
            }
        }
        System.out.println("Even Number " + even);
        System.out.println("Odd Number " + odd);

    }
}
