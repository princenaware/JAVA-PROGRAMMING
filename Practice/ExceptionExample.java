package Practice;
// This is an example of handling exceptions in Java. In this program, we attempt to divide a number by zero, which will throw an ArithmeticException
// The exception is caught in the catch block, and a message is printed to the user. The finally block is executed regardless of whether an exception was thrown or not, ensuring that a final message is always displayed.
// To run this program, simply copy and paste the code into a Java development environment or an online Java compiler, and execute it. You will see the output indicating that division by zero is not allowed, followed by a message confirming that the program executed successfully.
// Example output:
// Cannot divide by zero!
// Program executed successfully
// Note: You can modify the values of 'a' and 'b' to test with different numbers and see how the program handles exceptions in various scenarios.
// In this program, we have used a try-catch block to handle the ArithmeticException that occurs when attempting to divide by zero. The catch block catches the exception and prints a user-friendly message. The finally block ensures that a message is printed regardless of whether an exception occurred or not, demonstrating the use of exception handling in Java.
// Exception handling is a powerful mechanism in Java that allows developers to manage and respond to runtime errors gracefully, preventing the program from crashing and providing a better user experience.

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;   

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        finally {
            System.out.println("Program executed successfully");
        }
    }
}
