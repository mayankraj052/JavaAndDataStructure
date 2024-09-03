package Method_example.function;

public class DecToBin {
    public static void main(String[] args) {
        decToBin(81);
    }

    public static void decToBin(int dec) {
        int pow = 0;
        int bin = 0;
        while (dec > 0) {
            int rem = dec % 2;
            dec = dec / 2;
            bin = bin + rem * (int) Math.pow(10, pow);
            pow++;
        }
        System.out.println(bin);
    }
}
