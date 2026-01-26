//Practical 1 of Java Programming 
//Aim: Write a program to demonstrate Method Overloading in Java
//Date: 12/01/2026

//There are ways to define multiple methods with the same name but different parameters in a class. This is known as method overloading. The compiler differentiates these methods by their method signatures, which include the method name and the parameter list (type, number, and order of parameters).
//Method overloading is a compile-time polymorphism feature in Java that allows methods to perform similar functions with different types or numbers of inputs.
//Three ways to overload methods in Java:
//1. By changing the number of parameters 
//2. By changing the data type of parameters
//3. By changing the order of parameters (if they have different types)
//Note: Method overloading cannot be achieved by changing only the return type of the method.


//Example program demonstrating method overloading in Java:

class Addition {

    // add two integers
    int add(int a, int b) {
        return a + b;
    }

    // add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // add two double values
    double add(double a, double b) {
        return a + b;
    }
}

class Student {

    // method with (String, int)
    public void studentId(String name, int rollNo) {
        System.out.println("Name: " + name + ", Roll-No: " + rollNo);
    }

    // method with (int, String)
    public void studentId(int rollNo, String name) {
        System.out.println("Roll-No: " + rollNo + ", Name: " + name);
    }
}

public class Method_Overloading {

    public static void main(String[] args) {

        // Addition class object
        Addition obj = new Addition();
        System.out.println("Sum of 7 and 8: " + obj.add(7, 8));
        System.out.println("Sum of 6, 3 and 9: " + obj.add(6, 3, 9));
        System.out.println("Sum of 45.5 and 13.5: " + obj.add(45.5, 13.5));


        // Student class object
        Student s = new Student();
        s.studentId("Prince", 156);
        s.studentId(111, "Alex");
    }
}
