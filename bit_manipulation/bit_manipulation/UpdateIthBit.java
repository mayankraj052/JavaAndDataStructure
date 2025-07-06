package bit_manipulation;

public class UpdateIthBit {
    public static int getSetIthBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static int updateIthbit(int n, int i,int newbit){
        if(newbit ==0){
            return clearIthBit(n, i);
        }
        else{
            return getSetIthBit(n, i);
        }
        // n= clearIthBit(n, i);
        // int bitMask = newbit<<i;
        // return n|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthbit(10, 2,1));
    }
}
