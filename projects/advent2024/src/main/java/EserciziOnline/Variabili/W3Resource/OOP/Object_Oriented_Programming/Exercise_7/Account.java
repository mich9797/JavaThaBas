package EserciziOnline.Variabili.W3Resource.OOP.Object_Oriented_Programming.Exercise_7;

public class Account {

    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountnumber() {
        return accountNumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountNumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public String getAccountInfo() {
        return "Name: " + name + ", Account number: " + accountNumber + ", Balance: " + balance;
    }
}
