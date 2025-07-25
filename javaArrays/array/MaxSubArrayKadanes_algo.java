package array;

public class MaxSubArrayKadanes_algo {
    public static void main(String[] args) {
        int[] arr = { -2, -3, -4, -1, -2, -1, -5, -3 };
        maxSumKadane(arr);
    }

    public static void maxSumKadaneFirst(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum = curSum + arr[i];
            if (curSum < 0) {
                curSum = 0;
            }
            maxSum = Math.max(maxSum, curSum);
        }
        System.out.println("maximum sub array sum is " + maxSum);
    }

    public static void maxSumKadane(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum = Math.max(arr[i], curSum + arr[i]);
            maxSum = Math.max(maxSum, curSum);
        }
        System.out.println("maximum  sub array sum is " + maxSum);
    }
}