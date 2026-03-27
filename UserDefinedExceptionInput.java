// This program demonstrates the use of user-defined exceptions in Java. A user-defined exception is a custom exception that you can create by extending the Exception class. In this example, we have defined a custom exception called 'InvalidAgeException' that is thrown when a user enters an age that is less than 18. The main method prompts the user to enter their age and checks if it is valid. If the age is invalid, the custom exception is thrown and caught in the catch block, where an appropriate message is displayed to the user. Additionally, we have a catch block to handle any other exceptions that may occur during input, such as entering a non-integer value. Finally, we have a finally block that executes regardless of whether an exception was thrown or not, indicating that the program has ended.
// To run this program, simply copy and paste the code into a Java development environment or an online Java compiler, and execute it. You will be prompted to enter your age, and based on the input, you will see whether you are eligible to vote or if an exception has occurred. This program is a great way to understand how to create and use user-defined exceptions in Java, as well as how to handle them effectively.   
// Example output:
// Enter your age: 17
// Exception: Not eligible to vote
// Program ended
// Note: You can modify the 'InvalidAgeException' class and the main method to add more functionality or handle different types of exceptions as needed to further explore the concept of user-defined exceptions in Java. User-defined exceptions are a powerful tool for handling specific error conditions in your applications and can help improve the robustness and maintainability of your code.
// User-defined exceptions allow you to create meaningful error messages and handle specific scenarios that may arise in your application, making it easier for developers to debug and maintain the code.
// They also promote better error handling practices and can help improve the overall user experience by providing clear feedback on what went wrong.
// In this program, we have implemented a simple user-defined exception to demonstrate how it can be used to handle specific error conditions in Java applications.
// User-defined exceptions are an essential part of Java programming and can be used in various scenarios, such as validating user input, handling business logic errors, or managing specific conditions that may arise in your application. By creating custom exceptions, you can provide more meaningful error messages and improve the overall robustness of your code. In this program, we have implemented a simple user-defined exception to demonstrate how it can be used to handle specific error conditions in Java applications.


import java.util.Scanner;
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
public class UserDefinedExceptionInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("Not eligible to vote");
            } else {
                System.out.println("Eligible to vote");
            }
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        }
        finally {
            System.out.println("Program ended");
        }
        sc.close();
    }
}