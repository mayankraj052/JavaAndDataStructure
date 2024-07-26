package VariableAndDataType.Typepromotion;

public class Main {
    public static void main(String[] args) {
        // char ch1 = 'a'; //97
        // char ch2 = 'b'; //98
        // System.out.println(ch1 - ch2); //-1

        // convert all into int
        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = (byte) (a + b + c);
        // System.out.println(bt);// 1=-127

        // // jo bhi jada bda data type hoga usme convert kar dega
        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // double ans = a + b + c + d;
        // System.out.println(ans); // all converted into double

        byte b = 5;
        // byte b = b*2; // error due to type casting
        byte a = (byte) (b * 2); // first in 10(int) that why we use typecasting to convert in byte even in loss.
        System.out.println(a);
    }
}
// type promotion happen only with expression
// java automatically promotes each byte, short,or char operand into int when
// evaluating an expression.
// if one operand is long float or double the whole expression is promoted to
// long, float or double respectively.