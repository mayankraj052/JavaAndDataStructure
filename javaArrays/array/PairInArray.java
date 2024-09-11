package array;

public class PairInArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 8 };
        pairArray(arr);
    }

    public static void pairArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ") ");
            }
        }
    }
}
