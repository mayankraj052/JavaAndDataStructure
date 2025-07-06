package OOps;

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car(); 

        // Assigning values to object properties
        myCar.brand = "Tesla";
        myCar.speed = 150;

        // Calling method on the object
        myCar.displayCar();
    }
}
// Defining a class
class Car {
    // Instance variables (properties)
    String brand;
    int speed;

    // Method to display car details
    void displayCar() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}
