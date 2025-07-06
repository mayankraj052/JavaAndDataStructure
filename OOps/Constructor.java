package OOps;

public class Constructor {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Student s1 = new Student("Mayank", 21); // Parameterized Constructor
        s1.age = 56;
        s1.marks[0] = 45;
        s1.marks[1] = 45;
        s1.marks[2] = 45;
        Student s2 = new Student(); // Default Constructor
        Student s3 = new Student(s1); // Copy Constructor
        s1.age = 78;
        s1.marks[2]=55;
        // Calling the display method
        s1.display();
        s2.display();
        s3.display();
    }
}

class Student {
    String name;
    int age;
    int marks[] = new int[3];

    // Parameterized Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default Constructor
    public Student() {
        System.out.println("Default Constructor Called");
        this.name = "Unknown";
        this.age = 0;
    }

    // Copy Constructor
    public Student(Student s) {
        System.out.println("Copy Constructor Called");
        this.name = s.name;
        this.age = s.age;
    }

    // Method to display student details
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

// class Student {
// String name;
// int age;

// // Parameterized Constructor
// public Student(String name, int age) {
// this.name = name;
// this.age = age;
// }

// // Copy Constructor
// public Student(Student s) {
// this.name = s.name;
// this.age = s.age;
// }

// void display() {
// System.out.println("Student Name: " + name);
// System.out.println("Student Age: " + age);
// }
// }

// public class ConstructorExample {
// public static void main(String[] args) {
// Student s1 = new Student("Mayank", 21); // Parameterized Constructor
// Student s2 = new Student(s1); // Copy Constructor

// s1.display();
// s2.display(); // s2 has the same values as s1
// }
// }
