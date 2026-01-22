package DsaFundamental;

public class SecondLargestFinder {
    public static void main(String[] args) {

        int[] numbers = {12, 35, 1, 10, 34, 1};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }
        System.out.println("second largest is : " + second);
    }
}
