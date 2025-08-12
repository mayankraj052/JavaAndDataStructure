// package Method_example.function;

public class BinaryToDecimal {
    public static void main(String[] args) {
        binToDec(1010001);
    }

    public static void binToDec(int binNum) {
        int power = 0;
        int decNum = 0;
        while (binNum > 0) {
            int ld = binNum % 10;
            decNum = decNum + (ld * (int) Math.pow(2, power));
            power++;
            binNum = binNum / 10;
        }
        System.out.println(decNum);
    }
}

