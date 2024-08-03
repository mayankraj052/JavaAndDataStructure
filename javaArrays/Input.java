package javaArrays;

import java.util.Scanner;
import java.util.Arrays;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // array of primitives.
        // int[] arr = new int[5];
        // arr[0] = 23;
        // arr[0] = 45;
        // arr[0] = 233;
        // arr[0] = 543;
        // arr[0] = 6;
        // // [23, 45, 233, 543, 6]
        // // input using for loop
        // System.out.println("enter the input:");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }

        // // System.out.println(Arrays.toString(arr));

        // for (int i : arr) {
        // System.out.print(i + " ");
        // }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        // modify

        str[1] = "mayank";
        System.out.println(Arrays.toString(str));

        sc.close();
    }
}
