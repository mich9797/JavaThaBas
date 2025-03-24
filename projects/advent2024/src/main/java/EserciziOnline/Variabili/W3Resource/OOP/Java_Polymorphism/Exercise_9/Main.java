package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_9;


// Write a Java program to create a base class BankAccount with methods deposit() and withdraw().
// Create two subclasses SavingsAccount and CheckingAccount.
// Override the withdraw() method in each subclass to impose different withdrawal limits and fees.

public class Main {
    public static void main(String[] args) {

        BankAccount savingsAccount = new SavingsAccount(2000, 650);

        BankAccount checkingAccount = new CheckingAccount(1000, 100);

        withdrawFromAccount(savingsAccount, 300);
        withdrawFromAccount(savingsAccount, 250);

        System.out.println("Saving account balance: " + savingsAccount.getBalance());
        System.out.println("Checking account balance: " + checkingAccount.getBalance());





    }

    public static void withdrawFromAccount(BankAccount account, double amount) {

        account.withdraw(amount);
    }
}
