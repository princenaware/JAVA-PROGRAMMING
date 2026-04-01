package Practice;
// This program demonstrates method overriding in Java. Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. In this example, we have a superclass called 'Bank' with a method 'getInterest()' that returns an interest rate. The subclasses 'SBI' and 'HDFC' override this method to provide their own specific interest rates. In the main method, we create instances of both subclasses and call the 'getInterest()' method to see the overridden behavior in action.
// To run this program, simply copy and paste the code into a Java development environment or an online Java compiler, and execute it. You will see the output for both SBI and HDFC interest rates, demonstrating method overriding in Java.
// Example output:
// SBI Interest Rate: 5%
// HDFC Interest Rate: 7%
// Note: You can modify the 'Bank' class and the subclasses to add more methods or change the behavior as needed to further explore the concept of method overriding in Java. Method overriding is a fundamental aspect of object-oriented programming and allows for dynamic method dispatch, enabling polymorphism in Java applications.
// Method overriding is a powerful feature in Java that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. This promotes code reusability and allows for dynamic method dispatch, enabling polymorphism in Java applications.


class Bank {
    int getInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getInterest() {
        return 5;   
    }
}

class HDFC extends Bank {
    int getInterest() {
        return 7; 
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        SBI s = new SBI();
        HDFC h = new HDFC();

        System.out.println("SBI Interest Rate: " + s.getInterest() + "%");
        System.out.println("HDFC Interest Rate: " + h.getInterest() + "%");
    }
}