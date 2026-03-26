// This program searches for a number in an array and returns whether it was found or not.
// To run this program, simply copy and paste the code into a Java development environment or an online Java compiler, and execute it. You will be prompted to enter a number to search for, and the program will display whether the number was found in the predefined array or not.
// Example input:
// Enter the number you want to search: 68
// Example output:
// Your number was found in the array
// Example input:
// Enter the number you want to search: 100
// Example output:
// Your number was not found in the array
// The predefined array in this program is: {3, 6, 8, 87, 65, 4, 68, 23, 9, 98, 34}
// The program uses a linear search algorithm to check if the number exists in the array.
// The isFound method iterates through the array and returns true if the number is found, otherwise it returns false after checking all elements.
// Note: You can modify the predefined array and test with different numbers to search for.
  
import java.util.Scanner;

public class arraysearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3, 6, 8, 87, 65, 4, 68, 23, 9, 98, 34};
        System.out.println("Welcome to Array Searching\n");
        System.out.print("Enter the number you want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("Your number was found in the array");
        } else {
            System.out.println("Your number was not found in the array");
        }
    }

    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}