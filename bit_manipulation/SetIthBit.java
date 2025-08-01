// package bit_manipulation;

public class SetIthBit {
    public static int getSetIthBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(getSetIthBit(10,2));
        System.out.println(clearIthBit(10, 2));
    }
}
