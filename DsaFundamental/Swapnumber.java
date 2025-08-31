package DsaFundamental;

public class Swapnumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        // using arithmetic operation
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+" "+ b);
    }

}
