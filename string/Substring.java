package string;

public class Substring {
    public static String getSubstring(String str, int si, int ei) {
        String substr = new String("");
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = new String("hello World");
        System.out.println(str.substring(0, 7));
        System.out.println(getSubstring(str, 0, 7));
    }
}
