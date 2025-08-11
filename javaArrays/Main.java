// package javaArrays;
public class Main {
    public static void main(String[] args) {
        // Syntax
        // datatypes[] varibale_name = new datatypes[size];
        // let say size is 5.
        // int[] arr = new int[5];
        // or directly
        int[] arr1 = { 1, 2, 3, 4, 5 };

        // int[] arr2; // declaration of array. it is defineing in the stack memory.
        // arr2 = new int[5]; // initialization of array. it is created in the heap
        // memory.
        System.out.println(arr1[3]);

        String[] str = new String[4];
        System.out.println(str[0]); // bydefault all reference value are null.

        for (String element : str) { // enhanced for loop
            System.out.println(element);
        }
    }
}
// primative are store in stack and all other are store in heap memory
// bydefault all reference value are null.
