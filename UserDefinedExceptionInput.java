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