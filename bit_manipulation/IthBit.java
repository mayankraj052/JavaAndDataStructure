// package bit_manipulation;

public class IthBit {
    public static void getIthBit(int n,int i){
        int bitMask = 1<<i;
        if((n & bitMask)==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        getIthBit(10,2);
    }
}
