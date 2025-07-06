package OOps;

public class MethodOverriding {
    public static void main(String[] args) {

        Dear d = new Dear();
        d.eat(); // Calls Dear's eat() method

        Animal a = new Animal();
        a.eat(); // Calls Animal's eat() method

        Animal a1 = new Dear(); // Upcasting
        a1.eat(); // Calls Dear's eat() method due to Runtime Polymorphism
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything.");
    }
}

class Dear extends Animal {
    // @Override
    void eat() {
        System.out.println("eats only grass.");
    }
}
