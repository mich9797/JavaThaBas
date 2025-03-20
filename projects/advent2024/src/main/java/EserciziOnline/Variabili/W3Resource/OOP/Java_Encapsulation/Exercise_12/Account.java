package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_12;

public class Account {
    private int Accountnumber;
    private String accountHolder;
    private  double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountnumber() {
        return Accountnumber;
    }

    public void setAccountnumber(int accuntnumber) {
        Accountnumber = accuntnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
     public  void withDraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance += amount;
        }
     }
}
