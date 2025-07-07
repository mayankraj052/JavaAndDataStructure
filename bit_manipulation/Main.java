package bit_manipulation;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println("Binary AND of " + a + " and " + b + " is " + (a & b));
        System.out.println("Binary OR of " + a + " and " + b + " is " + (a | b));
        System.out.println("Binary XOR of " + a + " and " + b + " is " + (a ^ b));
        System.out.println("Binary COMPLIMENT of " + a + " is " + (~a ));
        System.out.println("Binary Left Shift of " + a + " by 1 is " + (a << 2));
        System.out.println("Binary Right Shift of " + a + " by 1 is " + (a >> 1));
    }
}
