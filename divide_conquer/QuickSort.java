package divide_conquer;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }
        int pindex = partition(arr, start, end);
        quickSort(arr, start, pindex - 1); //left
        quickSort(arr, pindex + 1, end); //right
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1; // to make place for smaller then pivot

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i ,j);
            }
        }
        i++;
        swap(arr, i, end);
        return i;
    }

    public static void swap(int[] arr,int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
