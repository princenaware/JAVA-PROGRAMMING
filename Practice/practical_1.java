// Method Overloading Example

class Addition {

    // add two integers
    int add(int a, int b) {
        return a + b;
    }

    // add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // add two double values
    double add(double a, double b) {
        return a + b;
    }
}

class Student {

    // method with (String, int)
    public void studentId(String name, int rollNo) {
        System.out.println("Name: " + name + ", Roll-No: " + rollNo);
    }

    // method with (int, String)
    public void studentId(int rollNo, String name) {
        System.out.println("Roll-No: " + rollNo + ", Name: " + name);
    }
}

 public class practical_1 {

    public static void main(String[] args) {

        // Addition class object
        Addition obj = new Addition();
        System.out.println("Sum of 7 and 8: " + obj.add(7, 8));
        System.out.println("Sum of 6, 3 and 9: " + obj.add(6, 3, 9));
        System.out.println("Sum of 45.5 and 13.5: " + obj.add(45.5, 13.5));

        System.out.println(); // blank line

        // Student class object
        Student s = new Student();
        s.studentId("Sweta", 1);
        s.studentId(2, "Gudly");
    }
}
