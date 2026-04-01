package Practice;
class Factorial {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // Use 'long' for calculation to prevent overflow
        long fact = 1;
        
        // Loop from 1 up to n
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        
        // Explicitly cast long back to int to match the required return type
        return (int) fact;
    }
}