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