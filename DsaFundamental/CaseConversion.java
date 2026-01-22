package DsaFundamental;

public class CaseConversion {
    public static void main(String[] args) {
        {
            String str = "hello";
            String upper = str.toUpperCase();
            String lower = str.toLowerCase();
            System.out.println(upper);
            System.out.println(lower);
        }
        // ASCII value difference: 32
        // 'A'(65) to 'a'(97)
        {
            char upper = 'a';
            char lower = (char) (upper - 32);
            System.out.println(lower);
        }
        {
            String input = "Java proGRaMMing";
            StringBuilder result = new StringBuilder();
            for (char c : input.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    result.append(Character.toLowerCase(c));
                } else if (Character.isLowerCase(c)) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(c);
                }
            }
            System.out.println("Original: " + input);
            System.out.println("Case converted: " + result.toString());
        }
    }
}
