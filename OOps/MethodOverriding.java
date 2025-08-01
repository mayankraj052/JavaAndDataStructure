// package OOps;

public class MethodOverriding {
    public static void main(String[] args) {

        Dear d = new Dear();
        d.eat(); // Calls Dear's eat() method

        Anima a = new Anima();
        a.eat(); // Calls Animal's eat() method

        Anima a1 = new Dear(); // Upcasting
        a1.eat(); // Calls Dear's eat() method due to Runtime Polymorphism
    }
}

class Anima {
    void eat() {
        System.out.println("eats anything.");
    }
}

class Dear extends Anima {
    // @Override
    void eat() {
        System.out.println("eats only grass.");
    }
}
