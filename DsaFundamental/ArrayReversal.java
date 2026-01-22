package DsaFundamental;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("original: " + Arrays.toString(arr));
        int start = 0, end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("after reversal: " + Arrays.toString(arr));
    }
}
