package LinearSearch;

// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] num = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
        int target = 45;
        int ans = linearSearch(num, target);
        ;
        System.out.println(ans);
    }
    // public static boolean linearSearch(int[] arr, int target) {
    // if (arr.length == 0) {
    // return false;
    // }
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == target) {
    // return true;
    // }
    // }
    // return false;
    // }

    // return index;
    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i + 1;
            }
        }
        return -1;
    }
}