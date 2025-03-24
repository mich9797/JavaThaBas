package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_9;

class CheckingAccount extends BankAccount {


    private double overdraftFee;


    public CheckingAccount(double initialBalance, double overdraftFee) {

        super(initialBalance);

        this.overdraftFee = overdraftFee;
    }


    @Override
    public void withdraw(double amount) {

        if (amount <= getBalance()) {

            super.withdraw(amount);
        } else {

            System.out.println("Overdraft fee applied.");

            super.withdraw(amount + overdraftFee);
        }
    }
}