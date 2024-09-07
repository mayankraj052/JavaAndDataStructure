package javaArrays.array;

// import java.util.HashSet;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(containDuplicate(arr));
    }

    public static boolean containDuplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; i++) {
                if (arr[j] == arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    // public boolean containDuplicate(int[] nums) {
    // HashSet<Integer> set = new HashSet<>();
    // for (int i = 0; i < nums.length; i++) {
    // if (set.contains(nums[i])) {
    // return true;
    // } else {
    // set.add(nums[i]);
    // }
    // }
    // return false;
    // }
}
