
public class ColumnNotFixed {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9, 88 }
        };

        // printing
        for (int i = 0; i < arr.length; i++) { // to acces rows
            for (int j = 0; j < arr[i].length; j++) { // to acess columns.
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// j<arr[i].length -> array i ka length