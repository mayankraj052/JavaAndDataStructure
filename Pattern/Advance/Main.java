package Pattern.Advance;

public class Main {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        butterfly(row, col);
    }

    public static void hollow_rectangle(int row, int col) {
        /*
         * # # # # #
         * # ______#
         * # ______#
         * # # # # #
         */
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /*
     * 12345
     * 1234
     * 123
     * 12
     * 1
     */
    public static void ivertedNumberPyramid(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static void floydTriangle(int row) {
        int k = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println("");
        }
    }

    /*
     * 1
     * 01
     * 101
     * 0101
     * 10101
     */
    public static void zeroOneTriangle(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void butterfly(int row, int col) {

    }
}
