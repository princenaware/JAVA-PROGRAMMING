import java.util.Scanner;

public class greaternumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
// this is an example of if-else-if control statement 
        if (num1 == num2)                                  
        {
            System.out.println("Both numbers are equal.");
        } 
        else if (num1 > num2) 
        {
            System.out.println(num1 + " is greater than " + num2);
        } 
        else 
        {
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}
    

