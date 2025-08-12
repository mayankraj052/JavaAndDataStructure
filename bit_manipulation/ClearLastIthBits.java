
public class ClearLastIthBits {
    public static int clearlastIbit(int n ,int i){
        int bitmask = (-1)<<i;
        return n&bitmask;
    }
    public static int clearbitsinrange(int n ,int i,int j){
        int a = (-1)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearlastIbit(15, 2));
        System.out.println(clearbitsinrange(10, 02, 4));
    }
}
