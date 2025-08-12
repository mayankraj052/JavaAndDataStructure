// package string;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        // int i = 0;
        int n = str.length();
        for(int i=0;i<str.length()/2;i++) {
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
            i++;
            // j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));
    }
    
}
