// package OOps;

public class AbstractClassJava {
    public static void main(String[] args) {
     Chicken c = new Chicken();
    //  c.eat();
     c.walk();
     c.leg();
    }
}

abstract class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse  constructor called");
    }
    void  changeColor(){
        color="dark brown";
    }
    void walk() {
        System.out.println("walks on four legs");
    }
}

class Chicken extends Horse{
    Chicken(){
        System.out.println("chicken constructor called");
    }
    void leg(){
        System.out.println("chicken have 2 leg");
    }
}