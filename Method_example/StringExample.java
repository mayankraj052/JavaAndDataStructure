package Method_example;

import java.util.*;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String greeting = myGreet(name);
        System.out.println(greeting);
        sc.close();
    }

    static String myGreet(String name) {
        String message = "hello " + name;
        return message;
    }
}
