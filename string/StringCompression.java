package string;

public class StringCompression {
    public static String compress(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        // String newStr = "";
        // for(int i =0;i<str.length();i++){
        // Integer count = 1;
        // while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
        // count++;
        // i++;
        // }
        // newStr += str.charAt(i);
        // if(count > 1){
        // newStr += count.toString();
        // }
        // }
        // return newStr;
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbbcccdd";
        // output => String str2 = "a3b2c3d2";
        System.out.println(compress(str));

    }
}
