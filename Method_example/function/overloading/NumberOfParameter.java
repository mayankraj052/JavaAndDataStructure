package Method_example.function.overloading;

public class NumberOfParameter {

    static int sum(int a, int b) {
        return a + b;
    }

    // static int sum(int a, int b, int c) {
        // return a + b + c;
    // }

    static float sum(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(2, 4));
        System.out.println(sum(4.8f, 4.1f));
    }


}
