package javaArrays;

import java.util.*;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(); // wrapper class Integer

        // // Adding elements to the ArrayList
        // list.add(76);
        // list.add(75);
        // list.add(78);
        // list.add(43);
        // list.add(770);
        // list.add(790);

        // // Checking if the list contains the number 58588858
        // System.out.println(list.contains(58588858)); // false

        // // Printing the ArrayList
        // System.out.println(list);// [76, 75, 78, 43, 770, 790]

        // // Setting the element at index 0 to 99
        // list.set(0, 99);// [99, 75, 78, 43, 770, 790]

        // // remove at index 2;
        // list.remove(2);// [99, 75, 43, 770, 790]
        // // Attempting to remove the element 770
        // list.remove(Integer.valueOf(770));// [99, 75, 43, 790]

        // // Printing the modified ArrayList
        // System.out.println(list);// [99, 75, 43, 770, 790]

        // input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // get itej at any fixed index

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));// pass index here. list[index] will not work here.
        }
System.out.println(list);
        sc.close();
    }
}
