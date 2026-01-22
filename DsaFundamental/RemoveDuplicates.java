package DsaFundamental;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 4, 6, 5};

        // Using HashSet
        Set<Integer> uniqueSet = new HashSet<>(Arrays.asList(number));
        Integer[] uniqueNumber = uniqueSet.toArray(new Integer[0]);
        System.out.println(Arrays.toString((uniqueNumber)));
    }
}
