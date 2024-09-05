package javaArrays.Binary_Search;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length - 1;
        int key = 10;
        int x = binarySearch(arr, 0, n, key);
        System.out.println("found at " + x);
    }

    public static int binarySearch(int arr[], int start, int end, int key) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}