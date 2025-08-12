// package TwoDArray;
import java.util.*;
class Matrices{
    public static void search(int[][] matrix, int key){
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean flag = false;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == key){
                    System.out.println("Element found at position: " + i + " " + j);
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("Element not found in the matrix.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // object of scanner class.
        System.out.println("Enter the number of rows and columns of the matrix: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 4);
        sc.close();
    }
}