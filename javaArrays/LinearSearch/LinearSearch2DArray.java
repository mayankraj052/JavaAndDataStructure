package LinearSearch;

import java.util.Arrays;

public class LinearSearch2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 }
        };
        int target = 56;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[][] arr, int target) {
        if (arr == null) {
            return new int[]{-1, -1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};  // Return [-1, -1] if the target is not found
    }
}
