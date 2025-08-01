
public class Max {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(maxRange(arr, 1));
    }

    static int maxRange(int[] arr, int start) {
        int end = arr.length - 1;
        if (start > end) {
            return -1;
        }
        // if(arr == null){
        // return -1;
        // }
        int maxval = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
