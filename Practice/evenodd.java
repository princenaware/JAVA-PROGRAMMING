import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        int number ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is EVEN");
        } else {
            System.out.println(number + " is ODD");
        }
    }
    
}
