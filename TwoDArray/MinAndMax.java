package TwoDArray;

public class MinAndMax {
    public static void findMinMax(int[][] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int[] row : arr) {
            for (int ele : row) {
                if (ele < min) {
                    min = ele;
                }
                if (ele > max) {
                    max = ele;
                }
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 4, 5, 6 }, { 7, 8, 9 }, { 1, 2, 3 }
        };
        findMinMax(arr);
    }
}
