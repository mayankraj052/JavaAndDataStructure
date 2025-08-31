package string.leetcode;

public class LCP {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
         System.out.println(longestCommonPrefix(strs));

    }
    public  static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return prefix.toString();
                }
            }

            prefix.append(c);
        }

        return prefix.toString();
    }
}
