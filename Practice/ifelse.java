import java.util.*;
public class ifelse {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = sc.nextInt();

    if (age > 18)
    {
        System.out.println("ADULT");
    
    }
    else
    {
        System.out.println("NOT ADULT");
    }
}
}
