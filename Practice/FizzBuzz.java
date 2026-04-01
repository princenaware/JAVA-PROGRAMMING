package Practice;
// This is a simple implementation of the FizzBuzz problem in Java. The program prints "Fizz" for numbers that are multiples of 3, "Buzz" for numbers that are multiples of 5, and "FizzBuzz" for numbers that are multiples of both 3 and 5. For all other numbers, it simply prints the number itself.
// To run this program, simply copy and paste the code into a Java development environment or an public class FizzBuzz {
// online Java compiler, and execute it. You will see the output for numbers from 1 to 20, demonstrating the FizzBuzz logic in action.
// Example output:
// 1
// 2
// Fizz
// 4
// Buzz
// Fizz
// 7
// 8
// Fizz
// Buzz 
public class FizzBuzz {
public static void main(String[] args) {
        // Test the fizzBuzz method with numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            fizzBuzz(i);
        }
    }
    public static void fizzBuzz(int number) {
        // 1. Check for both 3 and 5 first
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } 
        // 2. Check for 3
        else if (number % 3 == 0) {
            System.out.println("Fizz");
        } 
        // 3. Check for 5
        else if (number % 5 == 0) {
            System.out.println("Buzz");
        } 
        // 4. Default case
        else {
            System.out.println(number);
        }
    }
}

    

