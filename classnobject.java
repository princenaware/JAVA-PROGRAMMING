// Java program to demonstrate class and objects
// Useful for beginners and college students to understand OOP concepts in Java.
// Creating a class named Student
// with data members and methods.
// Then creating an object of the class and using its members.


import java.util.*;
class Student {
    // Data members (variables)
    String name;
    int age;

    // Method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class classnobject {
    public static void main(String[] args) {

        // Object creation
        Student s1 = new Student();

        // Assigning values
        s1.name = "Prince";
        s1.age = 20;

        // Calling method
        s1.displayDetails();
    }
} 
    

