package javaArrays.array;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int arr2[] = { 2, 3, 4 };
        // input in array
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
        }
        for (int i : arr2) {
            System.out.println(i + " ");
        }
        update(arr2);
        System.out.println(arr2[2]);
    }

    public static void update(int arr[]) {
        arr[2] = 99;
    }
}
