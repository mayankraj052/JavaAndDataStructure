package Java_Basic_programs.Palindrome;

public class Example1 {
    public static void main(String[] args) {
        int n = 353, r;
        int temp = n;
        int rev = 0;
        while (n != 0) {
            r = n % 10;
            rev = 10 * rev + r;
            n = n / 10;
        }
        if (temp == rev) {
            System.out.println(temp + " is palindrome.");
        } else {
            System.out.println(temp + " is not palindrome.");
        }
    }
}
