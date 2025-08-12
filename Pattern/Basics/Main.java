// package Pattern.Basics;

public class Main {
    public static void main(String[] args) {
        int row = 4;
        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println("");
        // }

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k < row - i; k++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k < row - i; k++) {
        // System.out.print("* ");
        // }
        // System.out.println("");
        // }

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < row - i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k < i; k++) {
        // System.out.print(" * ");
        // }
        // System.out.println("");
        // }

        // half pyramid
        /*
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         */
        // for (int i = 1; i <= row; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" " + j);
        //     }
        //     System.out.println("");
        // }

        /*
         * Character Pattern
         * A
         * B C
         * D E F
         * G H I J
         */
        char ch='A';
        for(int i=1;i<=row;i++){
            for(int j =1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println("");
        }

    }
}
