package DsaFundamental;

public class EvenOddIndexElements {
    public static void main(String[] args) {
        String[] elements = {"java", "Selenium", "Maven", "Docker", "jenkins", "Go"};

        System.out.println("Even index elements are: ");
        for (int i = 0; i < elements.length; i += 2) {
            System.out.print(elements[i] + " ");
        }
        System.out.println("Odd index elements: ");
        for (int i = 1; i < elements.length; i += 2) {
            System.out.print(elements[i] + " ");
        }
    }
}
