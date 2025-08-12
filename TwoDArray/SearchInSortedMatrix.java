// package TwoDArray;

public class SearchInSortedMatrix {
    public static void search(int [][]arr, int key){
        int rows = arr.length;
        int cols = arr[0].length;
        int i = 0, j = cols - 1; // Start from the top-right corner

        while (i < rows && j >= 0) {
            if (arr[i][j] == key) {
                System.out.println("Element found at position: (" + i + ", " + j+")");
                return;
            } else if (arr[i][j] > key) {
                j--; // Move left
            } else {
                i++; // Move down
            }
        }
        System.out.println("Element not found in the matrix.");
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        search(arr, 14); // use stair case search
    }
}
