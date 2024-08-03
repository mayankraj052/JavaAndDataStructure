package javaArrays;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));
        num (nums);
        System.out.println(Arrays.toString(nums));
    }
    static void num(int[]arr){
        arr[0] = 99;
    }
}

