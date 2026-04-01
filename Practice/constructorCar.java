package Practice;
// Practical - 2
// Aim: Write a program to demonstrate Constructor and its types in Java
// Date: 13/01/2026
// A constructor in Java is a special method that is used to initialize objects. It is called when an instance of a class is created. The constructor has the same name as the class and does not have a return type, not even void.
// Types of Constructors in Java:
// 1. Default Constructor: A constructor that takes no parameters and initializes the object with default values.
// 2. Parameterized Constructor: A constructor that takes parameters to initialize the object with specific values.
// 3. Copy Constructor: A constructor that creates a new object as a copy of an existing object. It takes an object of the same class as a parameter and copies its values to the new object.       
// Note: Java does not provide a default copy constructor, but you can create one by defining a constructor that takes an object of the same class as a parameter.

class Car {
    String brand;
    int price;

    // Default Constructor
    Car() {
        brand = "Toyota Fortuner";
        price = 5000000;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    Car(String b, int p) {
        brand = b;
        price = p;
        System.out.println("Parameterized Constructor Called");
    }

    // Copy Constructor
    Car(Car c) {
        brand = c.brand;
        price = c.price;
        System.out.println("Copy Constructor Called");
    }

    // Method to display car details
    void display() {
        System.out.println("Car Brand: " + brand + ", Price: " + price);
    }
}

public class constructorCar {
    public static void main(String[] args) {

        // Default constructor
        Car c1 = new Car();
        c1.display();

        System.out.println();

        // Parameterized constructor
        Car c2 = new Car("Ford Endeavour", 3500000);
        c2.display();

        System.out.println();

        // Copy constructor
        Car c3 = new Car(c2);
        c3.display();
    }
}
