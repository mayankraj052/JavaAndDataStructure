// Java AND Operator Example: Logical && and Bitwise &
package Operator_in_java.Java_Shift_Operator;

public class AndLogicalAndBitwise {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 10;
        System.out.println(a < b && a < c);// false && true = false
        System.out.println(a < b & a < c);// false & true = false
    }
}
