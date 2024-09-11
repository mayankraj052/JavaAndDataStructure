package Basic_Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 7, 9, 1, 3, 2 };
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // sort in ascending order

    // public static void bubbleSort(int arr[]) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = 0; j < arr.length - 1 - i; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }
    // }
    // }

    // to sort in descending order

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
