// Java program to add two matrices
// The program takes two 3x3 matrices as input and outputs their sum.
//  This is a simple example to demonstrate matrix addition in Java. It uses nested loops to read the matrices, perform the addition, and display the results.
// Note: The size of the matrices is fixed to 3x3 for simplicity, but it can be modified to handle larger matrices if needed.
// This program is useful for beginners to understand how to work with 2D arrays and perform basic operations on them in Java.
// To run this program, simply copy and paste the code into a Java development environment or an online Java compiler, and execute it. You will be prompted to enter the elements of the two matrices, and then the program will display the original matrices and their sum.
// Example input:
 // Enter elements of first matrix:
 // 1 2 3
 // 4 5 6
 // 7 8 9
 // Enter elements of second matrix:
 // 9 8 7
 // 6 5 4
 // 3 2 1
 // Example output:
 // FIRST MATRIX:
 // 1 2 3
 // 4 5 6
 // 7 8 9
 // SECOND MATRIX:
 // 9 8 7
 // 6 5 4
 // 3 2 1
 // ADDITION MATRIX:
 // 10 10 10
 // 10 10 10
 // 10 10 10
    
import java.util.Scanner;

class AddMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int sum[][] = new int[3][3];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Display first matrix
        System.out.println("FIRST MATRIX:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // Display second matrix
        System.out.println("SECOND MATRIX:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        // Display addition matrix
        System.out.println("ADDITION MATRIX:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}