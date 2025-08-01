// package OOps;
// import java.util.*;
//package OOps;
public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        {
            Dogs dobby = new Dogs();
            dobby.eat();
            dobby.legs = 4;
            dobby.displayLegs();
            dobby.Bread = "jrgbefjr";
            dobby.displayBread();
        }
        {
            Mammals m = new Mammals();
            m.eat();
            Fish f = new Fish();
            f.isFish = true;
            f.swim();
        }
    }
}

class Animalxy {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breadth");
    }
}

// Derived Class
class Fish extends Animalxy {
    boolean isFish;

    void swim() {
        if (isFish) {
            System.out.println("Swims in the water");
        }
    }
}

class Mammals extends Animalxy {
    int legs;

    void displayLegs() {
        System.out.println("calling from mammals and legs is " + legs);
    }
}

class Dogs extends Mammals {
    String Bread;

    void displayBread() {
        System.out.println("calling from dogs and bread is " + Bread);
    }
}