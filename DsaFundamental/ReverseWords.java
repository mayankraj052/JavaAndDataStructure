package DsaFundamental;

public class ReverseWords {

    public static void main(String[] args) {
        String sentence = "java Coding Interview";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word: words){
            StringBuilder reverseWord = new StringBuilder(word).reverse();
            result.append(reverseWord).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
