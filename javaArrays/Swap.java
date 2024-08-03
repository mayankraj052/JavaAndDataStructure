package javaArrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int arr[] = { 23, 45, 233, 543, 3};
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));}
        static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }}
