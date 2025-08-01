package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] num = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
        int target = 19;
        int start = 2;
        int end = 5;
        System.out.println(linearSearch(num, target, start, end));
    }

    public static int linearSearch(int[] num, int target, int start, int end) {
        if (num.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (num[i] == target) {
                return i + 1;
            }
        }
        return -1;
    }
}
