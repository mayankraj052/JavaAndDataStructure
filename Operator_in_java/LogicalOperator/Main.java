package Operator_in_java.LogicalOperator;

public class Main {
    public static void main(String[] args) {
        // System.out.println(5 > 0 && 10 > 5); // true
        // System.out.println(5 > 0 && 4 > 5);// false
        // System.out.println(4 > 5 && 5 > 1);// false
        // System.out.println(4 > 7 && 5 > 8);// false

        // System.out.println(5 > 0 || 10 > 5); // true
        // System.out.println(5 > 0 || 4 > 5);// true
        // System.out.println(4 > 5 || 5 > 1);// true
        // System.out.println(4 > 7 || 5 > 8);// false

        System.out.println(!(10 > 5));// false
        System.out.println(!(10 < 5));// true

    }
}
/*
 * && -> logical AND (agar ek bhi false to result false.)
 * || -> Logical OR (eggar ek bhi true to sara true.)
 * ! -> Logggical NOT ( true ko false , false ko true.)
 */