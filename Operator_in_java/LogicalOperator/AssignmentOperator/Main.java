package Operator_in_java.LogicalOperator.AssignmentOperator;

public class Main {
    public static void main(String[] args) {

        int x = 2, y = 5;
        // int a = (x*y/x);
        // int b = (x*(y/x));
        // System.out.println(a); //5
        // System.out.println(b);// 4

        y += 3;
        System.out.println(y);// 8
        x -= 3;
        System.out.println(x);// -1
        y *= 3;
        System.out.println(y);// 24
        y /= 3;
        System.out.println(x);// -1
    }
}

/*
 * = -> A = A + 10 -> A+=10
 * += ->
 * -= ->
 * *= ->
 * /+ ->
 */