package TwoDArray;

class SpiralMatrix {
    public static void printSpiral(int[][] arr) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.println(arr[startRow][j]);
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.println(arr[i][endCol]);
            }
            // buttom
            for (int j = endCol - 1; j >= startCol; j--) {
                if(startCol == endCol){
                    break;
                }
                System.out.println(arr[endRow][j]);
            }
            // left
            for (int i = endRow - 1; i >=startRow + 1; i--) {
                System.out.println(arr[i][startCol]);
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                //9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        printSpiral(arr);
    }
}
