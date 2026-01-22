package DsaFundamental;

public class StringToInteger {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);
        int num1 = Integer.valueOf(str);
        System.out.println(num1);
        IntegerToString(123);

        System.out.println("calling String to int conversion function");
        StringIntConversion("12345");
    }

    public static void IntegerToString(int nums) {
        String str1 = Integer.toString(nums);
        String str2 = String.valueOf(nums);

        System.out.println(str1);
        System.out.println(str2);
    }

    static void StringIntConversion(String numStr) {
        //String to Integer
        int num = Integer.parseInt(numStr);
        System.out.println("String to Integer: " + num);
        // Integer to String
        int number = 12345;
        String str = Integer.toString(number);
        System.out.println("Integer to String: " + str);
    }
}
