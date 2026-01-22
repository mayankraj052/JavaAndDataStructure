package DsaFundamental;

public class StringLength {
    public static void main(String[] args) {
        String str = "automation";
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of String Reached
        }
        System.out.println("Length of String is: " + length);
    }
}
