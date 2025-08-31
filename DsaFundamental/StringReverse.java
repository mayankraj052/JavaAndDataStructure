package DsaFundamental;

public class StringReverse {
    public static void main(String[] args) {
        String str = "mayank";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
