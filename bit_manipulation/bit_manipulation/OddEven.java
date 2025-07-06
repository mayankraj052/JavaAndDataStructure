package bit_manipulation;

public class OddEven {
    public static void findOddEven(int n){
        int bitMask =1;
        if((n & bitMask) == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        findOddEven(999);
    }
}
