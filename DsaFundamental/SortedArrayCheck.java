package DsaFundamental;

public class SortedArrayCheck {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 3, 5, 4};
        boolean isSorted = true;
        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] > arr2[i + 1]) {
                isSorted = false;
                break;
            }

        }
        System.out.println("Array is Sorted: " + isSorted);
    }
}
