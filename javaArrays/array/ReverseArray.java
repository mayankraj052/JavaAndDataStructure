package javaArrays.array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 9, 7, 4, 5, 1 };
        reverse(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

}
