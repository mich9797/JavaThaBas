package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_9;



class BankAccount {


    private double balance;


    public BankAccount(double initialBalance) {

        this.balance = initialBalance;
    }


    public double getBalance() {

        return balance;
    }


    public void deposit(double amount) {

        balance += amount;
    }


    public void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;
        } else {

            System.out.println("Insufficient funds.");
        }
    }
}
