package Practice;
// This program demonstrates the use of interfaces in Java. An interface is a reference type in Java that can contain only constants, method signatures, default methods, static methods, and nested types. It is a way to achieve abstraction and multiple inheritance in Java. In this example, we have defined an interface called 'Vehicle' with two methods: 'start()' and 'stop()'. We then have two classes, 'Car' and 'Bike', that implement the 'Vehicle' interface and provide their own implementations of the 'start()' and 'stop()' methods. Finally, in the main method, we create instances of 'Car' and 'Bike' and call their respective methods to demonstrate polymorphism.
// To run this program, simply copy and paste the code into a Java development environment or an online Java compiler, and execute it. You will see the output for both the Car and Bike starting and stopping, demonstrating the use of interfaces in Java.        
// Example output:
// Car starts with key
// Car stops with brake
// Bike starts with self-start button
// Bike stops with brake
// Note: You can modify the 'Vehicle' interface and the implementing classes to add more methods or change the behavior as needed to further explore the concept of interfaces in Java.
// Interfaces are a fundamental part of Java programming and are widely used in various applications, including GUI development, event handling, and more. They allow for a flexible and modular design, enabling developers to create code that is easier to maintain and extend.

interface Vehicle {
    void start();
    void stop();
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }

    public void stop() {
        System.out.println("Car stops with brake");
    }
}
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with self-start button");
    }

    public void stop() {
        System.out.println("Bike stops with brake");
    }
}
public class interfaces {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v1.stop();

        v2.start();
        v2.stop();
    }
}