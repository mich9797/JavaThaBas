package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_12;


// Write a Java program to create a class called Account with private instance variables accountNumber, accountHolder, and balance.
// Provide public getter and setter methods to access and modify these variables.
// Add a method called deposit() that takes an amount and increases the balance by that amount, and a method called withdraw()
// that takes an amount and decreases the balance by that amount.


public class Main {
    public static void main(String[] args) {

        Account account = new Account();

        account.setAccountHolder("Gorbachov");
        account.setAccountnumber(3406579);
        account.setBalance(289034950.56);

        account.deposit(45000000);
        account.withDraw(540000);

        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Account number: " + account.getAccountnumber());
        System.out.println("Balance: $" + account.getBalance());

    }
}
