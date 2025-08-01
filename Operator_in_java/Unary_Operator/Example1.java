// Postfix and Prefix.
package Operator_in_java.Unary_Operator;

public class Example1 {
    public static void main(String[] args) {
        int x = 10;
        x++; // post increment
        System.out.println(x); // 11
        int y = 10;
        y--;// post increment
        System.out.println(y);// 9
        int a = 10;
        int b = a--;
        int c = --a;
        System.out.println(a);// 8
        System.out.println(b);// 10
        System.out.println(c); // 8
    }
}

// i++ ->first use value then change it.
// ++i -> first change value then use it.
// i++ -> post
// ++ i -> pre