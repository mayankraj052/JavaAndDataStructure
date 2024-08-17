package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] num = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
        System.out.println(min(num));
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
