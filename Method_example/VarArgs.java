// package Method_example;

import java.util.*;

public class VarArgs {
    public static void main(String[] args) {
        demo(2, 3, "heuuegcu", "behchec", "bebce");
    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(int a, int b, String... v) {
        System.out.println(Arrays.toString(v));
    }
}
