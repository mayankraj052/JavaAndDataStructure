package Method_example.function.overloading;

public class palindromeNumber {
    public static void main(String[] args) {
        if (isPalindrome(121)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    public static boolean isPalindrome(int n) {
        int num = n;
        int rev = 0;
        while (num != 0) {
            int temp = num % 10;
            num = num / 10;
            rev = rev * 10 + temp;
        }
        if (rev == n) {
            return true;
        } else {
            return false;
        }
    }

}
