// The logical || operator doesn't check the second condition if the first condition is true. 
//It checks the second condition only if the first one is false.
//The bitwise | operator always checks both conditions whether first condition is true or false.
package Operator_in_java.Java_Shift_Operator;

public class OrLogicalAndBitwise {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a > b || a < c);// true ||true = true
        System.out.println(a > b | a < c);// true | true = true
    }
}
