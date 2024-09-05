package LinearSearch;

public class LargestNum {
    public static void main(String[] args) {
        int[] arr = { 8, 9, 10, 7, 4, 99, 101 };
        int x = findLargest(arr);
        System.out.println(x);
    }

    public static int findLargest(int arr[]) {
        int lar = arr[0];
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > lar) {
                lar = arr[i];
            }
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("smallest = " + small);
        return lar;
    }
}
