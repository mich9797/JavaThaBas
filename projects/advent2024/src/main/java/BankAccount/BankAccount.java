package BankAccount;

public class BankAccount {
    public static void main(String[] args) {
        Bank bank = new Bank();


        bank.addAccount("101", "Alessandro Zorzi", 1300.0);
        bank.addAccount("102", "Pirletto Nonino", 1580.6);
        bank.addAccount("103", "Marco Merkuza", 1580.6);

        bank.performTransaction("101", 531.6);
        bank.performTransaction("103", 250.0);


        bank.displayAccountInfo("101");
        bank.displayAccountInfo("102");
    }
}
