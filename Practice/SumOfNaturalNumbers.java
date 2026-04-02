import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Ask user to enter value of n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        int sum = 0;
        
        // loop to calculate sum
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        
        // print result
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        
        sc.close();
    }
}
