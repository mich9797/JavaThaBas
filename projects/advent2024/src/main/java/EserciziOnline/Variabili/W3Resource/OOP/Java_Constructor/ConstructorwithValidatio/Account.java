package EserciziOnline.Variabili.W3Resource.OOP.Java_Constructor.ConstructorwithValidatio;

public class Account {

    String accountNumber;
    double balance;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.err.println("Put a valid number");
            return;

        }

        if (balance < 0) {
            System.err.println("Put a valid number");
            return;
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
