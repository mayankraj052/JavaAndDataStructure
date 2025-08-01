package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Mayank";
        char target = 'n';
        System.out.println(search(name, target));
    }

    public static String search(String str, char target) {
        if (str == null) {
            return "String is empty";
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return "Target found at index " + (i + 1);
            }
        }
        return "Target not found";
    }
}
