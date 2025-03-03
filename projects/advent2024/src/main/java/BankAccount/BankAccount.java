package BankAccount;

public class BankAccount {
    public static void main(String[] args) {
        Bank bank = new Bank();


        bank.addAccount("101", "John Doe", 1300.0);
        bank.addAccount("102", "Jane Smith", 1580.6);

        bank.performTransaction("101", 531.6);
        bank.performTransaction("103", 250.0);


        bank.displayAccountInfo("101");
        bank.displayAccountInfo("102");
    }
}
