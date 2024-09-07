package javaArrays.array;

public class TrapRainWater {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 0, 3, 2, 5 };
        System.out.println(trap(arr));
    }

    public static int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLavel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLavel - height[i];
        }

        return trappedWater;
    }
}
