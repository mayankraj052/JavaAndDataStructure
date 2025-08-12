// package Method_example;

public class Shadowing {
    static int x = 89;

    // public static void main(String[] args) {
    // System.out.println(x);
    // x = 40;
    // System.out.println(x);
    // fun();
    // }

    // static void fun() {
    // System.out.println(x);
    // }
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        x = 40;
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
