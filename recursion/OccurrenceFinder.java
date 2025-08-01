
public class OccurrenceFinder {
    public static void main(String[] args){
        int [] arr = {2,9,5,7,2,7,3,9};
        System.out.println("first occurence of 2 is :"+firstOccurence(arr, 2,0));
        System.out.println("last occurence of 9 is :"+lastOccurence(arr, 9, arr.length-1));
    }
    static int firstOccurence(int[] arr, int target, int index){
        if (index >= arr.length) return -1;
        if (arr[index] == target) return index;
        return firstOccurence(arr, target, index + 1);
    }
    static int lastOccurence(int[] arr, int target, int index){
        if (index < 0) return -1;
        if (arr[index] == target) return index;
        return lastOccurence(arr, target, index - 1);
    }
}

