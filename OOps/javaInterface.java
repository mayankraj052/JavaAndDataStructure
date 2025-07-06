package OOps;

public class javaInterface {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves();

        Sparrow s = new Sparrow();
        s.eat();
        s.fly();
    }
}

// interface ChessPlayer {
//     void moves();
// }

// class Queen implements ChessPlayer {
//     public void moves() {
//         System.out.println("Up, down, left, right, diagonal");
//     }
// }

// class Rook implements ChessPlayer {
//     public void moves() {
//         System.out.println("Up, down, left, right");
//     }
// }

// class King implements ChessPlayer {
//     public void moves() {
//         System.out.println("Up, down, left, right, diagonal(by pne step)");
//     }
// }


// implementing multiple inheritence using interface.

// First interface
interface Animal {
    void eat();
}

// Second interface
interface Bird {
    void fly();
}

// A class implementing both interfaces (Multiple Inheritance)
class Sparrow implements Animal, Bird {
    public void eat() {
        System.out.println("Sparrow eats seeds.");
    }
    
    public void fly() {
        System.out.println("Sparrow flies in the sky.");
    }
}


