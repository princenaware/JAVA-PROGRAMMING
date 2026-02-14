public class FizzBuzz {
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
    

