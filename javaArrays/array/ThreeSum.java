package javaArrays.array;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = threeSum(nums);
        System.out.println("Resulting Triplets: " + result);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Use three loops to generate all possible triplets
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    // Step 2: Calculate the sum of triplets
                    if (nums[i] + nums[j] + nums[k] == 0) {

                        // Step 3: Sort the triplet to ensure uniqueness
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);

                        // Step 4: Add the triplet to the result list
                        result.add(triplet);
                    }
                }
            }
        }

        // Step 5: Remove duplicates using LinkedHashSet (preserves insertion order)
        result = new ArrayList<>(new LinkedHashSet<>(result));

        // Return the final result
        return result;
    }
}
