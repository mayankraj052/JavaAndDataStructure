package array;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        maxSubArray(arr);
    }

    public static void maxSubArray(int arr[]) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("{");
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.print("}");
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            System.out.println("");
        }
        System.out.println("maxSum= " + maxSum);
    }
}
