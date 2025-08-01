package VariableAndDataType.TypeConversion;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextInt();
        int a = 25;
        long b = a;
        // long c = 25;
        // int d = c; // we cann't change long into int
        System.out.println(b);
        // System.out.println(d);
        System.out.println(f);
        sc.close();
    }
}
/* byte->short->int->float->long->double */
// widering or implicit conversion
