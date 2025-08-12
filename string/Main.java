// package string;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        char arr[] = {'a','b','v','d','e','f','g','h','i','j'};
        String str1= "Hello, World!";
        String str2 = new String("Mayank");
        System.out.println(str1);
        System.out.println(arr);
        System.out.println(str2);

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(str1.concat(str2)); // concatination
        System.out.println(str1 +""+str2); // concatination
        sc.close();
    }
}
