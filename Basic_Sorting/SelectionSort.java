package Basic_Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = { 20, 12, 10, 15, 2 };
        selectionSort(data);
        for (int num : data) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[min] > data[j]) {
                    min = j;
                }
            }
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }
}
