package Basic_Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 8, 9, 2, 6, 4 };
        insertionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length - 1; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }
}
