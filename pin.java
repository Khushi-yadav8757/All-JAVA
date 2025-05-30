class Account {
    private int balance = 5000;  // Private data member
    private int pin = 1234;

    public void setPin(int enteredPin) {
        if (enteredPin == pin) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Incorrect PIN!");
        }
    }

    public int getBalance(int enteredPin) {
        if (enteredPin == pin) {
            return balance;
        } else {
            return -1;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setPin(1234);  // Correct PIN
        System.out.println("Balance: " + acc.getBalance(1234));
        
        acc.setPin(1111);  // Wrong PIN
        System.out.println("Balance: " + acc.getBalance(1111));
    }
}
